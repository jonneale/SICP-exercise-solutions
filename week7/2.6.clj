(defn zero
  []
  (fn[f]
    (fn [x]
      x )))

(defn church-zero [f] (fn [x] x))
(defn church-one [f] (f (fn [x] x)))

(defn add-1
  [n]
  (fn[f] (fn [x] (f ((n f) x)))))

(defn zero-test
  []
  (fn [x] x))

(defn one
  []
  (fn []  1))

(defn another-zero
  []
  0)

(defn eval-test
  [n]
  (fn [f] (n 0)))


                                        ;when we call (add-1 zero), this expands as follows:

(fn [f] (fn [x] (f ((zero f) x))))

(fn [f] (fn [x] (f (()))))


(defn church
  "Convert a natural number to a Church numeral."
  [n]
  (loop [n n, acc (fn [f] (fn [x] x))]
    (if (zero? n)
      acc
      (recur (dec n)
             (fn [f]
               (fn [x]
                 (f ((acc f) x))))))))

(defn unchurch
  "Convert a Church numeral to a plain integer."
  [n]
  ((n inc) 0))

