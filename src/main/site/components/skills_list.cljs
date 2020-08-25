(ns site.components.skills-list
  (:require [site.components.skills-item :as si]))

(defn render [{:keys [skills]}]
  [:ul.skills-list
   (map-indexed
     (fn [i skill-area] ^{:key i} [si/render skill-area])
     skills)])
