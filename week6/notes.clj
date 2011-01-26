(defn conse 
  [x y] 
  (defn dispatch 
    [m]
    (cond (= m 0) x
          (= m 1) y
          :else (throw "BOOM")))
  dispatch)

(defn car
  [z]
  (z 0))
  
(defn cdr
  [z]
  (z 1))

(cond ((= m 0) x) ((= m 1) y)
(else (error "Argument not 0 or 1 -- CONS" m)))) dispatch)
(define (car z) (z 0)) (define (cdr z) (z 1))