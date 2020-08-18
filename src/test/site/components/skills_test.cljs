(ns site.components.skills-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.skills :refer [render]]))

(deftest has-class-skills
  (-> (render)
      shallow
      (.hasClass "skills")
      is))
