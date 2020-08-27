(ns site.components.education-list-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.education-list :refer [render]]))

(deftest has-class-education-list
  (-> (render {})
      shallow
      (.hasClass "education-list")
      is))

(deftest renders-correct-number-of-education-items
  (-> {:education [{:organization "x"}
                   {:organization "y"}]}
      render
      e/render
      (.find ".education-item")
      (.-length)
      (= 2)
      is))
