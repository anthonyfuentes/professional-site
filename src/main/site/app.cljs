(ns site.app
  (:require [reagent.dom :as rdom]
            [site.data :as d]
            [site.components.index :as i]))

(defn init! []
  (rdom/render [i/render d/site-props]
               (.getElementById js/document "app")))
