;; ex 1.20
(defn gcd
      [a b]
      (if (= b 0)
      a
      (gcd b (remainder a b))))

;; Applicative order
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


;; Normal Order
;; (gcd 206 40)
;; (if = 40 0)
;;  (gcd 40 (remainder 206 40))
;;  (if = 6 0)                                                    <- has to evaluate remainder
;;    (gcd (remainder 206 40) (remainder 40 (remainder 206 40)))
;;    (if = 4 0)                                                  <- has to evaluate remainder
;;      (gcd (remainder 40 (remainder 206 40)) (remainder (remainder 206 40) (remainder 40 (remainder 206 40))))
;;      (if = 2 0)                                                <- has to evaluate remainder
;;        (gcd (remainder (remainder 206 40) (remainder 40 (remainder 206 40)) (remainder (remainder 40 (remainder 206 40)) (remainder (remainder 206 40) (remainder 40 (remainder 206 40))))
;;        (if = 0 0)                                              <- has to evaluate remainder
;;          (gcd (remainder (remainder 40 (remainder 206 40)) (remainder (remainder 206 40) 
;;               (remainder 40 (remainder 206 40)) (remainder (remainder (remainder 206 40) (remainder 40 (remainder 206 40)) (remainder (remainder 40 (remainder 206 40)) (remainder (remainder 206 40)))