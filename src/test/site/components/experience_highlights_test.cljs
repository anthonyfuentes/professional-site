(ns site.components.experience-highlights-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.experience-highlights :refer [render]]))

(deftest has-class-experience-highlights
  (-> (render {})
      shallow
      (.hasClass "experience-highlights")
      is))

(deftest renders-li-per-highlight
  (-> (render {:highlights ["" ""]})
      e/render
      (.find "li")
      (.-length)
      (= 2)
      is))
