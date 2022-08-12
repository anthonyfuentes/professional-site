(ns site.components.icon-link-table-test
  (:require [cljs.test :refer [deftest is]]
            [site.enzyme :refer [shallow]]
            [site.components.icon-link-table :as sut :refer [render]]))

(deftest has-class-icon-link-table
  (-> (render {})
      shallow
      (.hasClass "icon-link-table")
      is))
