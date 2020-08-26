(ns site.components.section-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e :refer [shallow]]
            [site.components.section :as sut]))

(deftest has-class-section
  (-> (sut/render {})
      shallow
      (.hasClass "section")
      is))

(deftest can-take-on-passed-class
  (-> (sut/render {:class "test"})
      shallow
      (.hasClass "test")
      is))

(deftest renders-a-child
  (let [child ^{:key :x} [:span.x]]
    (-> (sut/render {} child)
        e/render
        (.find ".x")
        (.-length)
        (= 1)
        is)))

(deftest renders-multiple-children
  (let [child ^{:key :x} [:span.x]]
    (-> (sut/render {} child child)
        e/render
        (.find ".x")
        (.-length)
        (= 2)
        is)))
