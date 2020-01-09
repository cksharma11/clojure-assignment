(ns guess-the-number)

(defn guess-the-number []
  (let [number (rand-int 10)]
    (println "Enter a guess:")
    (loop []
      (let [guess (Integer/parseInt (read-line))]
        (cond (> number guess)
              (do (println "Too Low!")
                  (recur))
              (< number guess)
              (do (println "Too Big!")
                  (recur))
              :else
              (println "Yeah!")))))
  )

(guess-the-number)