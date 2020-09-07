(ns site.components.svg-icon)

(defn file-for [icon]
  (str "images/" icon ".svg"))

(defn render [props]
  [:img.svg-icon {:src (-> props :icon file-for)
                  :alt (:alt props)}])
