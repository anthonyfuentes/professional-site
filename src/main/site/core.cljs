(ns site.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [devtools.core :as devtools]
            [site.app :as app]))

(def debug? ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (devtools/install!)
    (enable-console-print!)
    (println "dev mode")))

(defn ^:dev/after-load start []
  (app/init!))

(defn main! []
  (dev-setup)
  (-> js/document (.addEventListener "DOMContentLoaded" app/init!)))
