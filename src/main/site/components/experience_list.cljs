(ns site.components.experience-list
  (:require [site.components.experience-item :as ei]))

(defn render-items [{:keys [org title] :as role}]
  ^{:key (str org title)} [ei/render role])

(defn render [{:keys [experience]}]
  [:ol.experience-list
   (map render-items experience)])
