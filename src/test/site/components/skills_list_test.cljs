(ns site.components.skills-list-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.skills-list :refer [render]]))

(deftest has-class-skills-list
  (-> (render {})
      shallow
      (.hasClass "skills-list")
      is))

(deftest renders-correct-number-of-skills-items
  (-> {:skills [{} {}]}
      render
      e/render
      (.find ".skills-item")
      (.-length)
      (= 2)
      is))
