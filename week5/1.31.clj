;; a) a recursive procedure

(defn product
      [term a next b]
      (if (> a b)
          1
          (* (term a)
             (product term (next a) next b))))

(defn identity [x] x)

(defn factorial 
      [x]
      (product identity 1 inc x))

(defn pi-next
      [x]
      (if (
(defn compute-pi
      []
      (/ (product identity 2 pi-next 100)
         (product identity 3 pi-next 100)))


;; b) an iterative procedure

(defn product
      [term a next b]
      (defn iter
            [a product]
            (if (> a b)
                product
                (iter (next a) (* (term a) product))))
      (iter a 1))
