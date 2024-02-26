(defproject clj-commons/fs (or (System/getenv "PROJECT_VERSION") "0.1.0-SNAPSHOT")
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/clj-commons/fs"
  :deploy-repositories [["clojars" {:url "https://repo.clojars.org"
                                    :username :env/clojars_username
                                    :password :env/clojars_password
                                    :sign-releases true}]]

  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.apache.commons/commons-compress "1.26.0"]
                 ;; this lib is marked as optional in
                 ;; commons-compress, so we need to import it
                 ;; explicitly
                 [org.tukaani/xz "1.9"]]
  :plugins [[lein-midje "3.1.3"]
            [codox "0.8.10"]
            [lein-ancient "0.6.15"]]
  :codox {:src-dir-uri "https://github.com/clj-commons/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}
  :profiles {:dev {:dependencies [[midje "1.9.4"]]}})
