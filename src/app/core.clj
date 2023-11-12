(ns app.core
  (:require [etaoin.api :as e]
            [aero.core :refer (read-config)]))

(def cfg (read-config "config.edn" {}))

(def driver (e/chrome-headless))

(defn -main [_]
  (e/go driver (:dashboard cfg))
  (e/screenshot driver (:dashboard-img cfg)))