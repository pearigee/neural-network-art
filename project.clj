(defproject clj-art "0.0.1-SNAPSHOT"
  :description "Neural network image renderer."
  :url "https://medium.com/@gabepearhill/art-with-neural-networks-4bb97eb0db15#.bqvqyf2ijE"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [quil "2.3.0" :exclusions [org.clojure/clojure]]]
  :main clj-art.core
  :aot :all)
