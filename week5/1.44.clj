(def dx 0.000001)
(defn avg
  [nums]
  (/ (reduce + nums)
     (count nums)))

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
 
(defn smooth
  [f]
  (fn[x] (avg (list (f (- x dx))
             (f x)
             (f (+ x dx))))))
             
(defn n-fold-smooth
  [f n]
  ((repeated smooth n) f))