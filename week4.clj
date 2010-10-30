;; ex 1.16, write an iterative expt function
(defn fast-expt 
      [b n]
      (defn square
            [x]
            (* x x))
      (cond 
            (= n 0) 1
            (even? n) (square (fast-expt b (/ n 2)))
            :else (* b (fast-expt b (- n 1)))))


(defn faster-expt 
      [b n]
      (defn iter-expt
            [b n product]
            (defn square
                  [x]
                  (* x x))
            (do (println b n product)
            (cond 
                  (= n 0) product
                  (even? n) (iter-expt (square b) (/ n 2) product)
                  :else (iter-expt b (- n 1) (* b product)))))
      (iter-expt b n 1))

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
