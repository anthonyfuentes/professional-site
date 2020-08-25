(ns site.components.skills-item-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.skills-item :as sut]))

(deftest has-class-skills-item
  (-> (sut/render {})
      shallow
      (.hasClass "skills-item")
      is))
