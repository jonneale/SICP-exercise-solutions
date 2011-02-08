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


(defn get-width
  [interval]
  (make-interval
   (/ 
    (- (upper-bound interval)
       (lower-bound interval))
    2.0)))


;; when adding 2 intervals (2 10) + (3 8) the result is 5 18. Their
;; intervals are (4 2.5) - add both widths 6.5, therefore the result
;; will be some centre +/- 13

;; when multiplying two intervals (2 10) (3 8) you need to calculate
;; the minimum and maximum products of multiplying the two lower
;; bounds
;; p1 = lb x * lb y = 2 * 3 = 6
;; p2 = lb x * ub y = 2 * 8 = 16
;; p3 = ub x * lb y = 10 * 3 = 30
;;p4 = ub x * ub y = 10 * 8 = 80
;;result is min(p1 p2 p3 p4)  max(p1 p2 p3 p4)
;; = 6 80
;; width = 74

