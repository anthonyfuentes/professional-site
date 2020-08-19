(ns site.components.svg-icon)

(defn file-for [icon]
  (str "images/" icon ".svg"))

(defn render [props]
  (let [file (file-for (:icon props))]
    [:img.svg-icon {:src file}]))
