(ns site.data
  (:require [site.data.contact-info :as contact-info]
            [site.data.experience :as experience]
            [site.data.skills :as skills]))

(def resume
  {:name "Anthony Fuentes"
   :contact-info contact-info/all
   :experience experience/all
   :skills skills/all})
