(defproject jigsore "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
  	[org.clojure/clojure "1.6.0"]
  	; [org.clojure/data.zip "0.1.1"]
  	[clj-tagsoup/clj-tagsoup "0.3.0"]
  	]
  :aot [jigsore.core]
  :main jigsore.core)
