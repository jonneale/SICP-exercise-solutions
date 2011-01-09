



(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else -1)

(+ 2 (if (> )))

(defn square
  [i]
  (* i i))

(defn sum
  [xs]
  (reduce + xs))

(defn sum-of-squares
  [xs]
  (sum (map square xs)))

(defn sum-of-2-max
  [& xs]
  (sum-of-squares (take 2 (sort > xs))))

(defn sumofsquares [& a]
  (sort > a)
  (reduce +
          (map
           (fn [i]
             (* i i))
           (rest (sort a)))))

(sumofsquares 5 4 6)

((if true - +) 1 2)

(defn good-enough?
  [guess x]
  (< (Math/abs
      (- (square guess)
         x))
     0.001))



;;Exercise 1.7
;;
;;It doesn't work with small numbers because the margin of error is
;;only 0.001. With large numbers, there isn't enough precision for the
;;good enough test to ever pass (and thus would iterate forever). e.g:
;; 
;; sqrt 2,000,000,000,000
;;
;;it stops refining answer after iteration 26, which, is still
;;outside of an acceptable range for good-enough?: there isn't enough
;;precision to continue to refine, causing an infinite loop.
;; 
;; Rewrite good-enough + collect change between interations

(defn good-enough?
  [guess prev-guess]
  (< (/ (Math/abs (- prev-guess
                  guess))
        guess)
     0.001))

(defn average
  [x y]
  (/ (+ x
        y)
     2))

(defn improve
  [guess x]
  (average guess
           (/ x
              guess)))

(defn sqrt-iter
  [guess x prev-guess]
  (if (good-enough? guess
                    prev-guess)
    guess
    (recur (improve guess x) x guess)))

(defn sqrt
  [x]
  (sqrt-iter 1.0 x 0))

(defn improve-cube
  [guess x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(defn cuberoot-iter
  [guess x prev-guess]
  (if (good-enough? guess
                    prev-guess)
    guess
    (recur (improve-cube guess x) x guess)))

(defn cuberoot
  [x]
  (cuberoot-iter 1.0 x 0))


