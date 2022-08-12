(ns site.components.index-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :as e]
            [site.components.index :refer [render]]))

(deftest has-class-index
  (-> (render {})
      e/shallow
      (.hasClass "index")
      is))
