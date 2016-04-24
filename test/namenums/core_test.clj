(ns namenums.core-test
  (:require [namenums.core :refer :all]
            [midje.sweet :refer :all]))

(fact
 "A number outside of allowed range will be rejected"
 (name-it -1) => nil
 (name-it 1000) => nil)

(fact
 "Numbers are named correctly"
 (name-it 0) => "zero"
 (name-it 1) => "one"
 (name-it 24) => "twenty-four"
 (name-it 999) => "nine hundred and ninety-nine")
