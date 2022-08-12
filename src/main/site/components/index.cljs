(ns site.components.index
  (:require [site.components.icon-link-table :as table]
            [site.components.svg-icon :as icon]))

(def gh-icon-props
  {:icon "github"
   :alt "github icon: hollow silhouette of octocat in circle"})

(def li-icon-props
  {:icon "linkedin"
   :alt "linkedin icon: bolded i and n"})

(def email-icon-props
  {:icon "envelope"
   :alt "email icon: envelope outline"})

(def wave-icon-props
  {:icon "hand-wave"
   :alt "waving icon: a hand waving"})

(def resume-icon-props
  {:icon "resume"
   :alt "resume icon: stylized page with lines of text and link in bottom right corner"})

(def professional-icons
  {:github    gh-icon-props
   :linkedin  li-icon-props
   :resume    resume-icon-props})

(defn render
  [{:keys [first-name contact-info]}]
  [:article.index
   [:header.welcome
    [:h1 (str "Hello friend, I'm " first-name)]
    [icon/render wave-icon-props]]
   [:div
    [:header
     [:h3 "If you're interested in my work, find me here: "]]
    [table/render {:icons professional-icons :links contact-info}]]
   [:div
    [:header
     [:h3 "If you would like to reach me, contact me here: "]]
    [table/render {:icons {:email email-icon-props} :links contact-info}]]])
