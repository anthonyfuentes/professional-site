(ns site.components.skills-item
  (:require [clojure.string :refer [join]]))

(defn render [{:keys [display list]}]
  [:li.skills-item
   [:span.skill-area display]
   [:span (join ", " list)]])
