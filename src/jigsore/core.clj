(ns jigsore.core
  (:gen-class)
  (require [clojure.java.io :as io])
	(require [pl.danieljanus.tagsoup :as parser]))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (let [open-roles-xml (parser/parse "./data/open-roles.xml")]
  	(prn (class open-roles-xml))
  	)
  (println "Hello, World!"))
