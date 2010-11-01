;;Exercise 1.6
;;It's to do with the application of operands (applicative order),
;;not with how new-if returns results of the expressions. The example (new-if (= 2 3) 0 5
;;works because the operands are atoms. With compound expressions, the
;;interpreter has to expand the combination (irrespective of which
;;expression it returns the result of) causing it to enter an
;;infinite loop.
