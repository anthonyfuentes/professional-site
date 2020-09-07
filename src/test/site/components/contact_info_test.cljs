(ns site.components.contact-info-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.contact-info :refer [render]]))

(deftest has-class-contact
  (-> (render {})
      shallow
      (.hasClass "contact-info")
      is))

(deftest renders-correct-number-of-contact-details
  (-> (render {})
      e/render
      (.find ".contact-detail")
      (.-length)
      (= 4)
      is))
