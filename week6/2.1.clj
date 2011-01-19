(defn gcd [a b]
  (if (= b 0)
      a
      (recur b (rem a b))))
    
(defn make-rat [n d]
  (let [g (gcd n d)]
  (cons (/ n g) [(/ d g)])))