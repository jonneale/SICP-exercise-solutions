(defn h
      [a b n]
      (/ (- b a)
         n))

(defn yk
      [function a k h]
      (function (+ (* k h)
                   a)))
(defn sum
      [function a next b]
      (if (> a b) 0
          (+ (function a)
             (sum function (next a) next b))))

(defn simpsons-integral
      [function a b n]
      (* (/ (h a b n)
             3)) 
         (sum 0 n
           
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn cube
  [x]
  (* x x x))

(defn sum
  [function a next b]
  (if (> a b) 0
      (+ (function a)
         (sum function (next a) next b))))

(defn h
  [a b n]
  (/ (- b a)
     n))
     

(defn multiplier
  [x]
  (cond (even? x)
          (* 4 x)
        (:else)
          (* 2 x)))
 

(defn sum
  [function a next b]
  (if (> a b) 0
      (+ (function a)
         (sum function (next a) next b))))
                   
(defn round-to-next-even 
    [x] 
    (+ x (rem x 2)))
             
                                
(defn simpsons-rule
  [f a b n]
  (defn fixed-n [] (round-to-next-even n))
  (defn h [] (/ (- b a) n))
  (defn simpson-term [k]
    (defn y [] (f (+ a (* k h))))
    (cond (or (= k 0) (= k fixed-n))
            (* 1 y)
          (even? k)
            (* 2 y)
          (:else)
            (* 4 y)))
  (* (/ h 3) (sum simpson-term 0 inc fixed-n)))
    
        
     (sum f a inc n)))
     
     
     define (simpson f a b n) 
        (define fixed-n (round-to-next-even n)) 
        (define h (/ (- b a) fixed-n)) 
        (define (simpson-term k) 
          (define y (f (+ a (* k h)))) 
          (if (or (= k 0) (= k fixed-n)) 
              (* 1 y) 
              (if (even? k) 
                  (* 2 y) 
                  (* 4 y)))) 
        (* (/ h 3) (sum simpson-term 0 inc fixed-n))) 
