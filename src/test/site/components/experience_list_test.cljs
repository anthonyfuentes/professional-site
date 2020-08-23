(ns site.components.experience-list-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.experience-list :refer [render]]))

(deftest has-class-experience-list
  (-> (render {})
      shallow
      (.hasClass "experience-list")
      is))

(deftest renders-correct-number-of-experience-items
  (-> [{} {}]
      render
      e/render
      (.find ".experience-item")
      (.-length)
      (= 2)
      is))
