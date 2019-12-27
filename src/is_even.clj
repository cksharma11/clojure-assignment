(ns is-even)

(defn is-even [n] (= (mod n 2) 0))

(println (is-even 5))
(println (is-even 4))