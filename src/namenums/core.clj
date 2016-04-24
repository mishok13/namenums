(ns namenums.core
  (:gen-class))

(defn name-it
  "Given a number in range [0, 1000) return its textual representation"
  [n]
  (str n))

(defn -main
  [& args]
  (println (name-it (Integer/parseInt (first args)))))
