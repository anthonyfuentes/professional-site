(ns site.components.education-item-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.education-item :as sut]))

(deftest has-class-education-item
  (-> (sut/render {})
      shallow
      (.hasClass "education-item")
      is))

(deftest gpa-string-generates-correct-string
  (-> (sut/gpa-string "4.0")
      (= "(4.0 GPA)")
      is))
