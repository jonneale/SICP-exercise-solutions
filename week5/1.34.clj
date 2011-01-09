(defn f
  [g]
  (g 2))
;; (f square)
;; => 4
;; 
;; (f (fn[z] (* z (+ z 1))))
;; => 6
;; 
;; (f f)
;; Fails because we try to call (f (f (2))) which, in turn, calls (f (f (2 2))) fails because 2 is not an expression, and therefore cannot be evaluated