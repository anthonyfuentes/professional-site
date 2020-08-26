(ns site.components.skills
  (:require [site.components.skills-list :as sl]
            [site.components.section :as s]))

(def section-props
  {:title "Skills"
   :class "skills"})

(defn render [props]
  [s/render section-props
   ^{:key :sl} [sl/render props]])
