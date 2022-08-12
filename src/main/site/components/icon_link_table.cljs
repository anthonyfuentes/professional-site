(ns site.components.icon-link-table
  (:require [site.components.svg-icon :as icon]))

(defn- icon-link-row
  [{:keys [alt display icon url]}]
  [:tr.icon-link-row
   [:td [:a {:href url} [icon/render {:icon icon :alt alt}]]]
   [:td [:a {:href url} display]]])

(defn render
  [{:keys [icons links]}]
  [:table.icon-link-table
   [:tbody
    (for [[target props] icons]
      (icon-link-row (merge props (get links target {}))))]])
