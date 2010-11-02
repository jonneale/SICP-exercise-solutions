;; ex 1.23
(defn square
      [x]
      (* x x))
(defn divides?
      [a b]
      (= (rem b a) 0))
(defn next
      [x]
      (if (= x 2)
          3
       :else
          (+ x 2)))
(defn find-divisor 
      [n test-divisor]
         (cond (> (square test-divisor) n)
               n
               (divides? test-divisor n) test-divisor
               :else
               (find-divisor n (next test-divisor))))
(defn smallest-divisor
     [n]
     (find-divisor n 2))
(defn prime?
     [n]
     (= n (smallest-divisor n)))
(defn start-prime-test
     [n]
     (if (prime? n)
         (str "***")))      
(defn timed-prime-test
     [n]
     (do (println n)
         (time (start-prime-test n))))
   
 ;;  FAST                                 SLOW
 ;; user=> (timed-prime-test 1009)     user=> (timed-prime-test 1009) 
 ;; 1009                               1009
 ;; "Elapsed time: 0.233 msecs"        "Elapsed time: 0.261 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 1013)    user=>  (timed-prime-test 1013) 
 ;; 1013                               1013
 ;; "Elapsed time: 0.026 msecs"        "Elapsed time: 0.051 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 1019)    user=>  (timed-prime-test 1019) 
 ;; 1019                               1019
 ;; "Elapsed time: 0.027 msecs"        "Elapsed time: 0.05 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 10007)   user=>  (timed-prime-test 10007) 
 ;; 10007                              10007
 ;; "Elapsed time: 0.06 msecs"         "Elapsed time: 0.17 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 10009)   user=>  (timed-prime-test 10009) 
 ;; 10009                              10009
 ;; "Elapsed time: 0.064 msecs"        "Elapsed time: 0.158 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 10037)   user=>  (timed-prime-test 10037) 
 ;; 10037                              10037
 ;; "Elapsed time: 0.061 msecs"        "Elapsed time: 0.162 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 100003)  user=>  (timed-prime-test 100003) 
 ;; 100003                             100003
 ;; "Elapsed time: 0.212 msecs"        "Elapsed time: 0.33 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 100019)  user=>  (timed-prime-test 100019) 
 ;; 100019                             100019
 ;; "Elapsed time: 0.163 msecs"        "Elapsed time: 0.328 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 100043)  user=>  (timed-prime-test 100043) 
 ;; 100043                             100043
 ;; "Elapsed time: 0.173 msecs"        "Elapsed time: 0.35 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 1000003) user=>  (timed-prime-test 1000003) 
 ;; 1000003                            1000003
 ;; "Elapsed time: 0.48 msecs"         "Elapsed time: 1.569 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 1000033) user=>  (timed-prime-test 1000033) 
 ;; 1000033                            1000033
 ;; "Elapsed time: 0.526 msecs"        "Elapsed time: 1.028 msecs"
 ;; "***"                              "***"
 ;; user=>  (timed-prime-test 1000037) user=>  (timed-prime-test 1000037)
 ;; 1000037                            1000037
 ;; "Elapsed time: 0.575 msecs"        "Elapsed time: 1.607 msecs"
 ;; "***"                              "***"
 ;;    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 