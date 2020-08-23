(ns site.components.experience-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.experience :refer [render]]))

(deftest has-class-experience
  (-> (render {})
      shallow
      (.hasClass "experience")
      is))

(deftest renders-experience-list-component
  (-> (render {})
      e/render
      (.find ".experience-list")
      (.-length)
      (= 1)
      is))
