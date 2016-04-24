(defproject namenums "0.1.0-SNAPSHOT"
  :description "Convert numbers into their textual representation"
  :url "http://github.com/mishok13/namenums"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [midje "1.8.3"]]
  :main ^:skip-aot namenums.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
