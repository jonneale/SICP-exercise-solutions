(defn compose
  [f g]
  (fn[x] (f (g x))))
  
;; ((compose square inc) 6)
;;  -> 49