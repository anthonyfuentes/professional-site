(ns site.components.resume
  (:require [site.components.header :as head]
            [site.components.experience :as exp]
            [site.components.skills :as skl]
            [site.components.education :as edu]))

(defn render []
  [:article.resume
   [head/render]
   [exp/render]
   [skl/render]
   [edu/render]])
