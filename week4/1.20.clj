;; ex 1.20
(defn gcd
      [a b]
      (if (= b 0)
      a
      (gcd b (remainder a b))))

;;(gcd 206 40)
;;(if = 40 0) 206 
;;    (gcd 40 6)                                        <-remainder
;;         (if = 6 0) 40
;;             (gcd 6 4)                                <-remainder
;;                  (if = 4 0) 6
;;                      (gcd 4 2)                       <-remainder
;;                           (if = 2 0) 4               
;;                               (gcd 2 0)              <-remainder
;;                                    (if = 0 0) 2
