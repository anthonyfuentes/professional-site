(ns site.components.resume
  (:require [site.components.header :as head]
            [site.components.experience :as exp]
            [site.components.skills :as skl]
            [site.components.education :as edu]
            [site.components.download :as dl]))

(defn render [props]
  [:article.resume
   [head/render props]
   [exp/render props]
   [skl/render props]
   [edu/render props]
   [dl/render]])
