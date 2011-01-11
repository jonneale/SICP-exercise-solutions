(defn compose
  [f g]
  (fn[x] (f (g x))))
  
(defn repeated-iter
  [f g x i]
  (cond (= x i)
          f
        :else
        (repeated-iter (compose f g) g x (+ i 1))))
        
(defn repeated
  [f x]
  (repeated-iter f f x 1))
  
  ; user=> ((repeated inc 4) 1)
  ; 5
  ; user=> ((repeated inc 6) 1)
  ; 7
  ; user=> ((repeated inc 8) 1)
  ; 9
