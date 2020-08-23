(ns site.components.experience-item
  (:require [site.components.experience-detail :as ed]
            [site.components.experience-highlights :as eh]))

(defn render [props]
  [:li.experience-item
   [ed/render props]
   [eh/render props]])
