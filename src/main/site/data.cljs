(ns site.data
  (:require [site.data.contact-info :as contact-info]
            [site.data.experience :as experience]))

(def resume
  {:name "Anthony Fuentes"
   :contact-info contact-info/all
   :experience experience/all})
