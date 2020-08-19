(ns site.components.contact-info
  (:require [site.components.contact-detail :as cd]))

(defn render [props]
  [:section.contact-info
   [:table
    [:tbody
     [:tr
      [:td (cd/render (merge {:icon "envelope"}
                             (:email props)))]]
     [:tr
      [:td (cd/render (merge {:icon "linkedin"}
                             (:linkedin props)))]
      [:td (cd/render (merge {:icon "github"}
                             (:github props)))]]]]])
