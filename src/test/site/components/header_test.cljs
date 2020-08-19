(ns site.components.header-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.header :refer [render]]))

(deftest has-class-header
  (-> (render {})
      shallow
      (.hasClass "header")
      is))

(deftest renders-contact-component-info
  (-> (render {})
      e/render
      (.find ".contact-info")
      (.-length)
      (= 1)
      is))
