;; ex 1.18
(defn faster-times
      [a b]
      (defn double
            [x]
            (* x 2))
      (defn halve
            [x]
            (/ x 2))
      (defn times-iter
            [a b sum]
            (cond
                (= b 0)
                sum
                (even? b)
                (times-iter (double a) (halve b) sum)
                :else
                (times-iter a (- b 1) (+ a sum))))
      (times-iter a b 0))