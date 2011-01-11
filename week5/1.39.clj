; Define a procedure (tan-cf x k) that computes an approximation to the tangent function based on Lambert's formula. 
; K specifies the number of terms to compute, as in exercise 

(defn cont-frac-iter
  [n d k i sum]
  (cond (= i 1)
        (/ (n i)
           sum)
        (= i k)
          (recur n d k (- i 1) (/ (n k)
                                  (d k)))
        :else
          (recur n d k (- i 1) (+ (d (- i 1))
                                     (/ (n i)
                                         sum)))))
(defn cont-frac
  [n d k]
  (cont-frac-iter n d k k 1.0))
  
  
(defn tan-cf
  [x k]
  (cont-frac (fn[i] 
                (cond (= i 1) x :else (- 0 (* x x))))
             (fn[i] 
                (- (* i 2) 1))
             k))

;; tan 60 = .3200403893795631
;; (tan-cf 60.0 10)
;; --> -1.2424851438566678
;; (tan-cf 60.0 20)
;;--> -0.21199576186220534
;; (tan-cf 60.0 70) 
;;--> .3173773647198896
;; (tan-cf 60.0 100)
;;-->.3200403893795631
