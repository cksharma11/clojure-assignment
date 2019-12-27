(ns gcd)

(defn gcd [num1 num2]
  (if (zero? num1) num2
               (recur (mod num2 num1) num1)
               ))

(println (gcd 130 10))
(println (gcd 25 100))
(println (gcd 250 100))
(println (gcd 32 180))
(println (gcd 180 32))