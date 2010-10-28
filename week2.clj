;;1.9

(defn plus 
  [a b]
  (if (= a 0)
      b
      (inc (plus (dec a) b)))
      
;;(plus 4 5)
;;(inc (plus 3 5))
;;(inc (inc (plus 2 5)))
;;(inc (inc (inc (plus 1 5))))
;;(inc (inc (inc (inc (plus 0 5)))))
;;(inc (inc (inc (inc 5))))
;;(inc (inc (inc 6)))
;;(inc (inc 7))
;;(inc 8)
;;9
;;
;;This implies that this implementation is a recursive process




(defn plus 
  [a b]
  (if (= a 0)
      b
      (plus (dec a) (inc b))))
      
(defn plus 
  [a b]
  (if (= a 0)
      b
      (recur (dec a) (inc b))))
      
;;(plus 4 5)
;;(plus 3 6)
;;(plus 2 7)
;;(plus 1 8)
;;(plus 0 9)
;;9
;;
;;This implies that this implementation is an iterative process



;;1.10

(defn A
  [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                  (A x (- y 1)))))
                  
;; (A 1 10) -> 1024
;; (A 2 4) -> 65536
;; (A 3 3) -> 65536

;; (A 1 10)
;; (A 0 (A 1 9))
;; (A 0 (A 0 (A 1 8)))
;; (A 0 (A 0 (A 0 (A 1 7))))
;; (A 0 (A 0 (A 0 (A 0 (A 1 6)))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 5))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 4)))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 3))))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 2)))))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 1))))))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (2))))))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 4))))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 8)))))))
;; (A 0 (A 0 (A 0 (A 0 (A 0 32)))))
;; (A 0 (A 0 (A 0 (A 0 64))))
;; (A 0 (A 0 (A 0 128)))
;; (A 0 (A 0 256))
;; (A 0 512)
;; 1024


;; (A 0 n) -> returns 2n
;; (A 1 n) -> returns 2^n
;; (A 2 n) -> returns 2^(2^^n)






