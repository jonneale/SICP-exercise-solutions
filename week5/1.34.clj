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
;; Fails because we try to call (f (2)) which, in turn, calls (2 2) fails because 2 is not a function, and therefore cannot be evaluated