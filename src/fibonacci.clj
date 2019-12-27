(ns fibonacci)

(defn fibonacci [[a b]] [b (+ a b)])

(defn get-nth-fibonacci-term [n]
  (last (map first (take n (iterate fibonacci [0 1]))))
  )

(println (get-nth-fibonacci-term 10))
