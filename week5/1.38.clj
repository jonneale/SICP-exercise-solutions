; a continued fraction expansion for e - 2, where e is the base of the natural logarithms. 
; In this fraction, the Ni are all 1, and the Di are successively 1, 2, 1, 1, 4, 1, 1, 6, 1, 1, 8, ....
; Write a program that uses your cont-frac procedure from exercise 1.37 to approximate e, based on Euler's expansion.

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
  (cont-frac-iter n d k k 0))

;; if remainder x/3 = 0 then return x/3*2, else return 1
(defn eulers-function
  [x]
  (cond (= 0
           (rem (+ x 1)
                3))
         (* 2
            (/ (+ x 1)
                3))
        :else
          1))
  ;; given that e = 2.7182818...
  ;; (remember, we have to add 2, as this approximation is for e-2)
  ; user=> (+ 2 (cont-frac (fn[i] 1.0) eulers-function 10))
  ;; --> 2.718283582089552
  ; user=> (+ 2 (cont-frac (fn[i] 1.0) eulers-function 100))
  ;; --> 2.7182818284590455
  