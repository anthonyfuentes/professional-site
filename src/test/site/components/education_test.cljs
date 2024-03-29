(ns site.components.education-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.education :refer [render]]))

(deftest has-class-education
  (-> (render {})
      shallow
      (.hasClass "education")
      is))

(deftest renders-education-list-component
  (-> (render {})
      e/render
      (.find ".education-list")
      (.-length)
      (= 1)
      is))
