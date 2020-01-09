(ns dfa-validator)

(def dfa {
          :states      #{:c :b :a},
          :alphabet    #{:0 :1},
          :start       :a,
          :accepts     #{:b},
          :transitions {
                        :a {:0 :b, :1 :c},
                        :b {:0 :b, :1 :b},
                        :c {:0 :c, :1 :c}}})

(defn is-valid-dfa [input dfa]
  (loop [current (:start dfa) i input]
    (if (empty? i)
      (contains? (:accepts dfa) current)
      (recur ((first i) (current (:transitions dfa))) (rest i)))))

(println (is-valid-dfa '(:0 :1 :1 :1) dfa))