(ns site.components.skills-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.skills :refer [render]]))

(deftest has-class-skills
  (-> (render {})
      shallow
      (.hasClass "skills")
      is))

(deftest renders-skills-list-component
  (-> (render {})
      e/render
      (.find ".skills-list")
      (.-length)
      (= 1)
      is))
