(ns site.components.download-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e]
            [site.components.download :as sut]))

(deftest has-class-download
  (-> (sut/render)
      e/shallow
      (.hasClass "download")
      is))

(deftest renders-svg-icon-component
  (-> (sut/render)
      e/render
      (.find ".svg-icon")
      (.-length)
      (= 1)
      is))
