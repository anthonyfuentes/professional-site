(ns site.components.resume-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e]
            [site.components.resume :refer [render]]))

(deftest has-class-resume
  (-> (render)
      e/shallow
      (.hasClass "resume")
      is))

(deftest renders-header-component
  (-> (render)
      e/render
      (.find ".header")
      (.-length)
      (= 1)
      is))

(deftest renders-experience-component
  (-> (render)
      e/render
      (.find ".experience")
      (.-length)
      (= 1)
      is))

(deftest renders-skills-component
  (-> (render)
      e/render
      (.find ".skills")
      (.-length)
      (= 1)
      is))

(deftest renders-education-component
  (-> (render)
      e/render
      (.find ".education")
      (.-length)
      (= 1)
      is))
