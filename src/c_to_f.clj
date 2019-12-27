(ns c-to-f)

(defn c-to-f [c]
  (+ 32 (* c (/ 9 5)))
  )

(println (c-to-f 5))