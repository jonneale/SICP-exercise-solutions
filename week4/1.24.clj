;; ex 1.24
(defn fast-prime?
      [n counter]
      (let [a (+ 1 (int (* 10 (rand (/ n 10)))))
            remainder (rem (Math/pow a n) n)]
            (cond (not= remainder a)
                   false
                   (and (= remainder a) (= counter 5))
                   true
                   :else
                   (fast-prime? n (+ counter 1)))))

(defn start-prime-test
      [n]
      (if (fast-prime? n 0)
          (str "***")))

(defn timed-prime-test
      [n]
      (do (println n)
          (time (start-prime-test n))))