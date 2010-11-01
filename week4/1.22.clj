;; ex 1.22

(defn square
      [x]
      (* x x))
(defn divides?
      [a b]
      (= (rem b a) 0))
(defn find-divisor 
      [n test-divisor]
         (cond (> (square test-divisor) n)
               n
               (divides? test-divisor n) test-divisor
               :else
               (find-divisor n (+ test-divisor 1))))

(defn smallest-divisor
      [n]
      (find-divisor n 2))
(defn prime?
      [n]
      (= n (smallest-divisor n)))
(defn timed-prime-test
      [n]
      (do (println n)
          (time (start-prime-test n))))
(defn start-prime-test
      [n]
      (if (prime? n)
          (str "***")))