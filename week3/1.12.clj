;; Ex 1.12
(defn pas
  [height width]
  (cond 
    (= width 0) 
        1
    (or (< width 0) (< height 0))
        0
    (> width height)
        0
    :else
        (+ (pas (- height 1) (- width 1)) 
           (pas (- height 1) width))))
  
(defn print-pas-iter
  [height width max-height current-line]
  (cond 
    (> height max-height)
      (println current-line)
    (> width height)
      (do 
        (println current-line)
        (print-pas-iter (+ height 1) 0 max-height ()))
    :else
      (print-pas-iter height (+ 1 width) max-height (conj current-line (pas height width)))))
            
(defn print-pas
  [depth]
  (print-pas-iter 0 0 depth ()))