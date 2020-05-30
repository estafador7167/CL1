(defn Example[]
  (loop [x 1]
        (when (<= x 5)
              (println x)
              (recur (+ x 1)))))
(Example)