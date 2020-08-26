(ns site.components.experience
  (:require [site.components.experience-list :as el]
            [site.components.section :as s]))

(def section-props
  {:title "Experience"
   :class "experience"})

(defn render [props]
  [s/render section-props
   ^{:key :el} [el/render props]])
