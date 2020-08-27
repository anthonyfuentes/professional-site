(ns site.components.education-item-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.education-item :refer [render]]))

(deftest has-class-education-item
  (-> (render {})
      shallow
      (.hasClass "education-item")
      is))
