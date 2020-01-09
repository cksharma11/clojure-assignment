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

(defn is-valid-dfa-1 [input dfa]
  (loop [current (:start dfa) i input]
    (if (empty? i)
      (contains? (:accepts dfa) current)
      (recur ((first i) (current (:transitions dfa))) (rest i)))))

(defn is-valid-dfa-2 [candidate dfa]
  (contains? (:accepts dfa)
             (reduce #(%2 (%1 (:transitions dfa))) (:start dfa) candidate)))

(println (is-valid-dfa-1 '(:0 :1 :0 :1) dfa))
(println (is-valid-dfa-2 '(:0 :1 :0 :1) dfa))