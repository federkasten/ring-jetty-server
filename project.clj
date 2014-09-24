(defproject ring-jetty/ring-server "0.1.0-SNAPSHOT"
  :description "Library for running Ring web servers"
  :url "https://github.com/federkasten/ring-jetty-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.incubator "0.1.3"]
                 [ring-jetty/ring-jetty-adapter "0.1.0-SNAPSHOT"]
                 [ring "1.3.1"]
                 [ring-refresh "0.1.2"]]
  :plugins [[codox "0.6.6"]]
  :profiles {:dev {:dependencies [[clj-http "1.0.0"]]}})
