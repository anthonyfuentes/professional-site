(ns site.components.resume-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e]
            [site.components.resume :refer [render]]))

(deftest has-class-resume
  (-> (render)
      e/shallow
      (.hasClass "resume")
      true?
      is))
