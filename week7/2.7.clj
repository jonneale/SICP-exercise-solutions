;2.7 define a procedure make-interval
(defn cons
  [a b]
  (defn dispatch
    [m]
    (cond
          (= m 0) a
          :else b))
  dispatch)

(defn car
  [x]
  (x 0))

(defn cdr
  [x]
  (x 1))

(defn make-interval
  [a b]
  (cons a b))

(defn upper-bound
  [interval]
  (cdr interval))

(defn lower-bound
  [interval]
  (car interval))
