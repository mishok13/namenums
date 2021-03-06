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
    (cond
      (contains? simple-numbers n) (get simple-numbers n)
      (< n 100) (str (name-it (- n (mod n 10))) "-" (name-it (mod n 10)))
      (= 0 (mod n 100)) (str (name-it (quot n 100)) " hundred")
      (< n 1000) (str (name-it (quot n 100)) " hundred and " (name-it (mod n 100)))
      :else (str n))))

(defn -main
  [& args]
  (println (name-it (Integer/parseInt (first args)))))
