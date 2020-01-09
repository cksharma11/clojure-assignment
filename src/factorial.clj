(ns factorial)

(defn factorial [n]
  (apply * (range 1 (inc n)))
  )

(factorial 5)