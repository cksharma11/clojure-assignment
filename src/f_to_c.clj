(ns f-to-c)

(defn f-to-c [f]
  (float (* (- f 32) (/ 5 9)))
  )

(println (f-to-c 35))
