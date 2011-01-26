(defn make-rectangle 
  [top-left bottom-right] 
  (defn dispatch 
    [m]
    (cond (= m 0) top-left
          (= m 1) bottom-right
          :else (throw "BOOM")))
  dispatch)