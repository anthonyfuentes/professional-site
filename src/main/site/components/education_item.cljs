(ns site.components.education-item)

(defn gpa-string [gpa]
  (str "(" gpa " GPA)"))

(defn render [props]
  [:li.education-item
   [:span
    [:span.organization (:organization props)]
    [:span.dates (:dates props)]]
   [:span
    [:span (:description props)]
    [:span (-> props :gpa gpa-string)]]])
