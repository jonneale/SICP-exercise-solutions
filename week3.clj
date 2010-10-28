;; Ex 1.11

(defn f-re
  [n]
  (if (< n 3)
      n
      (+ (f-re (- n 1)) 
         (* 2 (f-re (- n 2)))
         (* 3 (f-re (- n 3))))))
        
(defn f-it
  [a b c count]
    (if (= count 0)
        c
        (f-it (+ a 
                 (* 2 b)
                 (* 3 c)) 
               a b 
               (- count 1))))
               
(defn f
  [n]
  (f-it 2 1 0 n))


(= (f 1) (f-re 1))
(= (f 2) (f-re 2))
(= (f 3) (f-re 3))
(= (f 4) (f-re 4))
(= (f 5) (f-re 5))
(= (f 6) (f-re 6))
(= (f 7) (f-re 7))


;; Ex 1.12
(defn pas
  [height width]
  (cond 
    (= width 0) 
        1
    (or (< width 0) (< height 0))
        0
    (> width height)
        0
    :else
        (+ (pas (- height 1) (- width 1)) 
           (pas (- height 1) width))))
  
(defn print-pas-iter
  [height width max-height current-line]
  (cond 
    (> height max-height)
      (println current-line)
    (> width height)
      (do 
        (println current-line)
        (print-pas-iter (+ height 1) 0 max-height ()))
    :else
      (print-pas-iter height (+ 1 width) max-height (conj current-line (pas height width)))))
            
(defn print-pas
  [depth]
  (print-pas-iter 0 0 depth ()))
  
;; Ex 1.13 - Note, this proof breaks down near the end and isn't complete

; x = ((1 - root 5) / 2)
; y = ((1 + root 5) / 2)
; fib(n) = (y^n - x^n)/ root 5
;                       
;                       
; For fib(n) to be the closest integer to y^n/root5 then:
; 
; 1. |fib(n) - y^n/root5)| <= 0.5
; 
; We stated above that
; 
; 2. fib(n) = (y^n - x^n)/ root 5
; 
; rearrange we get:
; 
; 3. fib(n) - (y^n)/root5 = - (x^n)/root5
; 
; Subst into 1.
; 
; 4. -(x^n/root5) <= 0.5
; 
; rearrange:
; 
; 5. x^n <= root5/2
; 
; We know that for any small (< 1) positive value of two values, a and b that
; 
; 6. a^b < 1
; 
; In fact, b can be any positive integer, so long as a is less than 1
; 
; So we must try and prove that x <= 1, as n will always be a positive number, as we know that
; 
; 7. root5/2 > 1
; 
; 
; 
; 
; Fib n is close to ((1 + root 5)/2 * n) / 2
; 
; 
; 
; x(n) = ((1 - root 5) / 2) * n
; y(n) = ((1 + root 5) / 2) * n
; fib(n) = (y(n) - x(n))/ root 5
; 
; Definition of fibonacci number:
; F(n) = F(n-1) + F(n-2)
; F(0) = 0
; F(1) = 1
; 
; F(2) = 1 + 0
; 
; F(3) = F(2) + F(1)
;      = F(1) + F(0) + F(1)
;      = 2
; 
; F(5) = F(4) + F(3)
;      = F(3) + F(2) + F(3)
;      = F(2) + F(1) + F(2) + F(2) + F(1)
;      = F(1) + F(0) + F(1) + F(1) + F(0) + F(1) + F(0) + F(1)
;      = 5
;      
; 1 1 2 3 5 8 
; 
; x(0) = 0
; y(0) = 0
; 
; x(1) = ((1 - root 5) / 2) * 1
; y(1) = ((1 - root 5) / 2) * 1
; 
; fib(n) = n(1 - root 5 / 2) - n(1 + root 5 / 2)
;         -------------------------------------
;                       root 5
;         
;         = (n - n(root 5) / 2n) + (n + n (root 5) / 2n)
;          ----------------------------------------------
;                       root 5
;                       
;         = (n - n(root 5)) / 2n(root 5) + (n + n(root 5)) / 2n(root5)
;         
;         = n - n(root5) + n + n(root5)
;           ___________________________
;                     2n (root5)
;                     
;         =         2n
;           -------------------
;               2n (root 5)
;               
;         = 1/root5ell
