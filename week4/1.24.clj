;; ex 1.24
(defn fast-prime?
      [n counter]
      (let [a (+ 1 (rand (- n 1)))
            remainder (expmod a n n)]
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
          
(defn square
    [x]
    (* x x))
  
(defn expmod 
    [base exp m]
    (cond (= exp 0) 1
          (even? exp) (rem (square (expmod base (/ exp 2) m)) m)
          :else (rem (* base (expmod base (- exp 1) m)) m)))