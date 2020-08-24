(ns site.components.experience-list
  (:require [site.components.experience-item :as ei]))

(defn render [{:keys [experience]}]
  [:ol.experience-list
   (map-indexed
     (fn [i role] ^{:key i} [ei/render role])
     experience)])
