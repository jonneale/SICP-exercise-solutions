;; define a function which takes a function and applies it twice
(defn double
  [f]
  (fn[x] (f (f x))))
  
;; What values does (((double (double double)) inc) 5) result in?
;; (double double) will cause the next function to be called 4 times. we then double (double double), which will cause the number of calls to be squared, so 21?

;; (((double (double double)) inc) 5) 
;; ->21