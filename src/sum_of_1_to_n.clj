(ns sum-of-1-to-n)

(defn sum-of-1-to-n [n]
  (/ (* n (dec n)) 2)
  )

(println (sum-of-1-to-n 10))
(println (sum-of-1-to-n 11))