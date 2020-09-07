(ns site.components.contact-detail
  (:require [site.components.svg-icon :as icon]))

(defn render [props]
  [:a.contact-detail {:href (:url props)
                      :download (:download props)}
   [icon/render props]
   (:display props)])
