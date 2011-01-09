(def tolerance 0.00001)
(defn fixed-point
  [f first-guess]
    (defn close-enough?
      [v1 v2]
    (< (Math/abs (- v1 v2)) tolerance))
    (defn test
      [guess]
      (let [next (f guess)]
        (cond (close-enough? guess next)
                next
              :else
                (test next))))
    (test first-guess))
    
(defn cos
  [x]
  (Math/cos x))
  
(fixed-point (fn[x] (+ 1 (/ 1 x))) 1.0)
;; 1.6180327868852458
