(ns namenums.core
  (:gen-class))

(def ^:private simple-numbers
  {0 "zero"
   1 "one"
   2 "two"
   3 "three"
   4 "four"
   5 "five"
   6 "six"
   7 "seven"
   8 "eight"
   9 "nine"
   10 "ten"
   11 "eleven"
   12 "twelve"
   13 "thirteen"
   14 "fourteen"
   15 "fifteen"
   16 "sixteen"
   17 "seventeen"
   18 "eighteen"
   19 "nineteen"
   20 "twenty"
   30 "thirty"
   40 "fourty"
   50 "fifty"
   60 "sixty"
   70 "seventy"
   80 "eighty"
   90 "ninety"
   100 "hundred"})

(defn name-it
  "Given a number in range [0, 1000) return its textual representation"
  [n]
  (when (<= 0 n 999)
    (if-let [name (get simple-numbers n)]
      name
      (str n))))

(defn -main
  [& args]
  (println (name-it (Integer/parseInt (first args)))))
