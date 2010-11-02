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
            (cond 
                  (= n 0) product
                  (even? n) (iter-expt (square b) (/ n 2) product)
                  :else (iter-expt b (- n 1) (* b product))))
      (iter-expt b n 1))