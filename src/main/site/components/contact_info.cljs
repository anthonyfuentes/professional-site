(ns site.components.contact-info
  (:require [site.components.contact-detail :as cd]))

(def email-icon-props
  {:icon "envelope"
   :alt "email icon: envelope outline"})

(def download-icon-props
  {:icon "download"
   :url "./resources/resume.pdf"
   :download true
   :alt "download icon: cloud with arrow pointing downward"
   :display "Download PDF"})

(def li-icon-props
  {:icon "linkedin"
   :alt "linkedin icon: bolded i and n"})

(def gh-icon-props
  {:icon "github"
   :alt "github icon: hollow silhouette of octocat in circle"})

(defn render [props]
  [:section.contact-info
   [:table
    [:tbody
     [:tr
      [:td [cd/render (merge (:email props) email-icon-props)]]
      [:td [cd/render download-icon-props]]]
     [:tr
      [:td [cd/render (merge (:github props) gh-icon-props)]]
      [:td [cd/render (merge (:linkedin props) li-icon-props)]]]]]])
