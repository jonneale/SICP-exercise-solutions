; Define a procedure cont-frac such that evaluating (cont-frac n d k) computes the value of the k-term finite continued fraction. 
; Check your procedure by approximating 1/ using
; (cont-frac (lambda (i) 1.0) (lambda (i) 1.0) k) 
; for successive values of k. How large must you make k in order to get an approximation that is accurate to
; 4 decimal places?
(defn cont-frac
  ([n d k]
    (cont-frac n d k k 0))
  ([n d k i sum]
    (cond (= i 1)
          (/ (n i)
             sum)
          (= i k)
            (recur n d k (- i 1) (/ (n k)
                                    (d k)))
          :else
            (recur n d k (- i 1) (+ (d (- i 1))
                                       (/ (n i)
                                           sum))))))
  
  ; user=> (/ 1 (cont-frac (fn[i] 1.0) (fn[i] 1.0) 12))
  ; 1.6179775280898876
  ; user=> (/ 1 (cont-frac (fn[i] 1.0) (fn[i] 1.0) 13))
  ; 1.6180555555555558
(defn cont-frac-recursive
  [n d k i]
  (cond (= i k)
          (/ (n i)
             (d i))
        :else
          (/ (n i)
             (+ (d i)
                (cont-frac-recursive n d k (+ i 1))))))

(defn cont-frac-r
  [n d k]
  (cont-frac-recursive n d k 0.0))

  ; user=> (/ 1 (cont-frac-r (fn[i] 1.0) (fn[i] 1.0) 12))
  ; 1.6180257510729614
  ; user=> (/ 1 (cont-frac-r (fn[i] 1.0) (fn[i] 1.0) 11))
  ; 1.6180555555555558
  ; user=> (/ 1 (cont-frac-r (fn[i] 1.0) (fn[i] 1.0) 10))
  ; 1.6179775280898876

