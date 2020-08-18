(ns site.components.experience-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.experience :refer [render]]))

(deftest has-class-experience
  (-> (render)
      shallow
      (.hasClass "experience")
      is))
