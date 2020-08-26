(ns site.components.section)

(defn render [{:keys [title class]} & children]
  [:section.section {:class class}
   [:h2 title]
   children])
