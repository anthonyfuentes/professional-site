(ns site.components.svg-icon-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.svg-icon :as sut :refer [render]]))

(deftest file-for-correctly-builds-file-name
  (-> "test"
      sut/file-for
      (= "images/test.svg")
      is))

(deftest has-class-svg-icon
  (-> (render {})
      shallow
      (.hasClass "svg-icon")
      is))
