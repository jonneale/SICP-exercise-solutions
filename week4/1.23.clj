;; ex 1.23
(defn square
      [x]
      (* x x))
(defn divides?
      [a b]
      (= (rem b a) 0))
(defn next
      [x]
      (if (= x 2)
          3
       :else
          (+ x 2)))
(defn find-divisor 
      [n test-divisor]
         (cond (> (square test-divisor) n)
               n
               (divides? test-divisor n) test-divisor
               :else
               (find-divisor n (next test-divisor))))
(defn smallest-divisor
     [n]
     (find-divisor n 2))