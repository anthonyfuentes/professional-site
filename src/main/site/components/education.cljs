(ns site.components.education
  (:require [site.components.education-list :as el]
            [site.components.section :as s]))

(def section-props
  {:title "Education"
   :class "education"})

(defn render [props]
  [s/render section-props
   ^{:key :edul} [el/render props]])
