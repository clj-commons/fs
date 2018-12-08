(defproject clj-commons/fs "1.5.1-SNAPSHOT"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/clj-commons/fs"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.apache.commons/commons-compress "1.8"]]
  :plugins [[lein-midje "3.1.3"]
            [codox "0.8.10"]
            [lein-ancient "0.6.15"]]
  :codox {:src-dir-uri "https://github.com/clj-commons/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}
  :profiles {:dev {:dependencies [[midje "1.9.4"]]}
             :set-version {:plugins [[lein-set-version "0.4.1"]]}})
