(defn compose
  [f g]
  (fn[x] (f (g x))))
  
(defn repeated
  [f x]
  (fn[times] compose  ))