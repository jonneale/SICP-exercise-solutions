(def a 3)
(def b 4)
(= a b)
(if (and (> b a)
         (> b
            (* a b)))
  b
  a)