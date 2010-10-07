(/
 (+ 5
    4
    (- 2
       (- 3
          (+ 6
             4/5))))
 (* 3
    (- 6 2)
    (- 2 7)))

(def a 3)
(def b 4)
(= a b)
(if (and (> b a)
         (> b
            (* a b)))
  b
  a)

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

