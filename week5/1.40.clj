(defn cubic
  [a b c]
  (fn[x] (+ (Math/pow x 3)
            (* a
               (Math/pow x 2))
            (* b x)
            c)))

(def dx 0.00001)

(defn deriv
  [g]
  (fn[x] (/ (- (g (+ x
                     dx))
               (g x))
            dx)))

(defn newton-transform
  [g]
  (fn[x] (- x
            (/ (g x)
               ((deriv g) x)))))

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
   
(defn newtons-method
  [g guess]
  (fixed-point (newton-transform g) guess))
