(ns site.components.education-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.education :refer [render]]))

(deftest has-class-education
  (-> (render)
      shallow
      (.hasClass "education")
      is))
