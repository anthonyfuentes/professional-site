(ns site.components.experience-highlights)

(defn render [{highlights :highlights}]
  [:span.experience-highlights
   [:ul
    (map-indexed
      (fn [i h] ^{:key i} [:li h])
      highlights)]])
