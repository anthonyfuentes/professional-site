(ns site.components.experience-detail)

(defn generate-dates-string [props]
  (str (:start props) " - " (:end props)))

(defn render [props]
  [:table.experience-detail
   [:tbody
    [:tr.title
     [:td (:title props)]]
    [:tr.organization
     [:td (:organization props)]]
    [:tr.dates
     [:td (generate-dates-string props)]]]])
