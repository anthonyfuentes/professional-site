(ns site.components.education-list
  (:require [site.components.education-item :as ei]))

(defn render-items [studies]
  ^{:key (:organization studies)} [ei/render studies])

(defn render [{:keys [education]}]
  [:ol.education-list
   (map render-items education)])
