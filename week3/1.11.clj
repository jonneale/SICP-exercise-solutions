;; Ex 1.11

(defn f-re
  [n]
  (if (< n 3)
      n
      (+ (f-re (- n 1)) 
         (* 2 (f-re (- n 2)))
         (* 3 (f-re (- n 3))))))
        
(defn f-it
  [a b c count]
    (if (= count 0)
        c
        (f-it (+ a 
                 (* 2 b)
                 (* 3 c)) 
               a b 
               (- count 1))))
               
(defn f
  [n]
  (f-it 2 1 0 n))


(= (f 1) (f-re 1))
(= (f 2) (f-re 2))
(= (f 3) (f-re 3))
(= (f 4) (f-re 4))
(= (f 5) (f-re 5))
(= (f 6) (f-re 6))
(= (f 7) (f-re 7))