(ns site.app
  (:require [reagent.dom :as rdom]
            [site.components.resume :as r]))

(defn init! []
  (prn "Initializing routes")
  (rdom/render [r/render] (.getElementById js/document "app")))
