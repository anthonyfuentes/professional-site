(ns site.components.skills
  (:require [site.components.skills-list :as sl]))

(defn render [props]
  [:section.skills
   [:h2 "Skills"]
   [sl/render props]])
