(ns simple-interest)

(defn simple-interest [p r t]
  (/ (* p r t) 100)
  )

(println (simple-interest 2000 10 2))