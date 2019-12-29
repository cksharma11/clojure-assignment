(ns rock-paper-scissor)

(def player-won-message "Yehh!! You won!")
(def computer-won-message "Ohh hoo!! Computer won!")
(def draw-message "Draw !! Better luck next time!")
(def options-message "1. rock\n2. paper\n3. scissor\nEnter your move : ")

(def moves ["rock" "paper" "scissor"])

(def winning-combinations {"rock" "paper" "paper" "scissor" "scissor" "rock"})

(defn has-won? [self-move other-move]
  (= (get winning-combinations other-move) self-move))

(defn game-result [player-move computer-move]
  (cond (has-won? computer-move player-move)
        (do (println player-won-message))

        (has-won? player-move computer-move)
        (do (println computer-won-message))

        :else (println draw-message)
        ))

(defn rock-paper-scissor []
  (let [computer-move (get moves (rand-int 3))]
    (println options-message)
    (let [player-move (read-line)]
      (game-result player-move computer-move)
      )
    ))

(rock-paper-scissor)
