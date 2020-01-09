(ns fibonacci)

(defn fibonacci [[a b]] [b (+ a b)])

(defn get-nth-fibonacci-term [n]
  (last (map first (take n (iterate fibonacci [0 1]))))
  )

(println (get-nth-fibonacci-term 10))

(defn fib [n]
  (if (or (= n 0) (= n 1))
    n
    (+ (fib (- n 1)) (fib (- n 2))))
  )

(println (fib 10))