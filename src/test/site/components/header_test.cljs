(ns site.components.header-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.header :refer [render]]))

(deftest has-class-header
  (-> (render)
      shallow
      (.hasClass "header")
      is))
