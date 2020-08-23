(ns site.components.experience
  (:require [site.components.experience-list :as el]))

(defn render [props]
  [:section.experience
   [:h2 "Experience"]
   [el/render props]])
