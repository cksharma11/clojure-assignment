(ns rock-paper-scissor)

(def moves ["rock" "paper" "scissor"])

(def game-results {["rock" "rock"]    "draw" ["paper" "paper"] "draw" ["scissor" "scissor"] "draw"
                   ["rock" "paper"]   "computer won" ["paper" "scissor"] "computer won" ["scissor" "rock"] "computer won"
                   ["rock" "scissor"] "player won" ["paper" "rock"] "player won" ["scissor" "paper"] "player won"})

(defn print-game-result [player-move computer-move]
  (println (get game-results [player-move computer-move])))

(defn rock-paper-scissor []
  (let [computer-move (get moves (rand-int 3))
        player-move (get moves (rand-int 3))]               ;can be command line input
    (print-game-result player-move computer-move)))

(rock-paper-scissor)
