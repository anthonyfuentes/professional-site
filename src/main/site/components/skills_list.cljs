(ns site.components.skills-list
  (:require [site.components.skills-item :as si]))

(defn render-items [{:keys [display] :as skill-area}]
  ^{:key display} [si/render skill-area])

(defn render [{:keys [skills]}]
  [:ul.skills-list
   (map render-items skills)])
