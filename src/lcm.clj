(ns lcm)

(defn gcd [num1 num2]
  (if (zero? num1) num2
                   (recur (mod num2 num1) num1)
                   ))

(defn lcm [num1 num2]
  (-> (* num1) (* num2) (/ (gcd num1 num2) ))
  )

(println (lcm 2 5))