(ns site.components.experience-item-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.experience-item :refer [render]]))

(deftest has-class-experience-item
  (-> (render {})
      shallow
      (.hasClass "experience-item")
      is))

(deftest renders-experience-detail-component
  (-> (render {})
      e/render
      (.find ".experience-detail")
      (.-length)
      (= 1)
      is))

(deftest renders-experience-highlights-component
  (-> (render {})
      e/render
      (.find ".experience-highlights")
      (.-length)
      (= 1)
      is))
