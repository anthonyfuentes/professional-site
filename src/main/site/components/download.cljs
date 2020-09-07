(ns site.components.download
  (:require [site.components.svg-icon :as icon]))

(def anchor-config
  {:href "/resources/resume.pdf"
   :download true})

(def icon-props
  {:icon "download"
   :alt "download icon: cloud with arrow pointing downward"})

(defn render []
  [:a.download anchor-config
   [icon/render icon-props]])
