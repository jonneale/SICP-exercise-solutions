;; ex 1.17
(defn times
      [a b]
      (if (= b 0)
          0
          (+ a (times a (- b 1)))))

(defn fast-times
      [a b]
      (defn double
            [x]
            (* x 2))
      (defn halve
            [x]
            (/ x 2))
      (cond 
            (= b 1)
            a
            (even? b)
            (fast-times (double a) (halve b))
            :else
            (+ a (fast-times a (- b 1)))))