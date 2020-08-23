(ns site.components.experience-detail-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.experience-detail :as sut :refer [render]]))

(deftest has-class-experience-detail
  (-> (render {})
      shallow
      (.hasClass "experience-detail")
      is))

(deftest generate-dates-string-generates-correctly
  (-> {:start "Sep 2008" :end "Dec 2012"}
      sut/generate-dates-string
      (= "Sep 2008 - Dec 2012")
      is))
