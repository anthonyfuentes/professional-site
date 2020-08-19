(ns site.components.header
  (:require [site.components.contact-info :as ci]))

(defn render [props]
  [:header.header
   [:h1 (:name props)]
   [ci/render (:contact-info props)]])
