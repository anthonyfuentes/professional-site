(ns site.data.skills)

(def languages
  {:display "Languages"
   :list ["Clojure" "JavaScript" "Ruby" "PHP"]})

(def libraries
  {:display "Platforms, libraries"
   :list ["Reagent + re-frame" "React + Redux" "Ruby on Rails" "LAMP"]})

(def web
  {:display "Web"
   :list ["HTML5" "CSS3" "jQuery"]})

(def other
  {:display "Other"
   :list ["git" "SQL" "Linux" "Ansible"]})

(def all
  [languages
   libraries
   web
   other])
