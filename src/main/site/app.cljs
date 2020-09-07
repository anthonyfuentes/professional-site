(ns site.app
  (:require [reagent.dom :as rdom]
            [site.data :as d]
            [site.components.resume :as r]))

(defn init! []
  (rdom/render [r/render d/resume]
               (.getElementById js/document "app")))
