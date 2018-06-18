(defproject akvo/fs "dev"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/Raynes/fs"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.apache.commons/commons-compress "1.8"]]
  :plugins [[lein-midje "3.1.3"]
            [codox "0.8.10"]]
  :codox {:src-dir-uri "https://github.com/Raynes/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}
  :deploy-repositories [["releases" {:url           "https://clojars.org/repo"
                                     :sign-releases false
                                     :username      "akvo"
                                     :password      :env/clojars_password}]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}
             :set-version {:plugins [[lein-set-version "0.4.1"]]}})
