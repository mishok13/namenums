(ns namenums.core-test
  (:require [namenums.core :refer :all]
            [midje.sweet :refer :all]))

(tabular
 (fact
  "A number outside of allowed range will be rejected"
  (name-it ?n) => nil)
 ?n
 -1
 1000
 Integer/MAX_VALUE)

(tabular
 (fact
  "Numbers are named correctly"
  (name-it ?num) => ?text)
 ?num ?text
 0 "zero"
 1 "one"
 24 "twenty-four"
 45 "fourty-five"
 123 "one hundred and twenty-three"
 200 "two hundred"
 240 "two hundred and fourty"
 243 "two hundred and fourty-three"
 309 "three hundred and nine"
 999 "nine hundred and ninety-nine")
