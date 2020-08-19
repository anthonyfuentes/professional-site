(ns site.components.contact-detail-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.contact-detail :refer [render]]))

(deftest has-class-contact-detail
  (-> (render {})
      shallow
      (.hasClass "contact-detail")
      is))

(deftest renders-svg-icon
  (-> (render {})
      e/render
      (.find ".svg-icon")
      (.-length)
      (= 1)
      is))
