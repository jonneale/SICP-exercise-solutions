;; Define a procedure to sum numbers in a range
(defn sum-integers
  [a b]
  (cond (> a b) 
        0
        :else
        (+ a (sum-integers (+ a 1) b))))

;; Define a procedure to sum the cube of integers in a range
(defn sum-cubes 
  [a b]
  (cond (> a b)
        0
        :else
        (+ (cube a) (sum-cubes (+ a 1) b))))

;; Define a procedure to sum terms in the series:
;;   1      1       1
;; _____  ______ ______
;; 1 . 3  5 . 7  9 . 11
;;  which very slowly converges to pi/8

(defn pi-sum 
  [a b]
  (cond (> a b) 
        0
        (+ (/ 1.0 (* a (+ a 2))) (pi-sum (+ a 4) b))))
        


(defn f
  [x,y]
  (defn square [x] (* x x))
  (+ (* x
      (square (+ 1 
                 (* x y))))
     (* y
        (- 1 y))
     (* (+ 1
           (* x y)))
        (- 1 y)))

(defn f-lambda
  [x,y]
  ((fn[a b]
    (+ (* x (square a))
       (* y b)
       (* a b)))
  (+ 1 (* x y))
  (- 1 y)))
  
(defn f-let
  [x y]
  (let [a (+ 1 (* x y))
        b (- 1 y)]
      (+ (* x (square a))
         (* y b)
         (* a b))))