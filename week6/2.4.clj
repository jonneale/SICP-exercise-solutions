(defn cons
  [x y]
  (fn [m] (m x y)))

(defn car
  [z]
  (z (fn [p q] p)))

(defn cdr
  [z]
  (z (fn [p q] q)))


;; user> (cons 2 3)
;; #<user$cons$fn__1994 user$cons$fn__1994@40128cad>
;; user> (car (cons 2 3))
;; 2
;; user> (cdr (cons 2 3))
;; 3

