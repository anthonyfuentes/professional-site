(ns site.data.skills)

(def languages
  {:display "Languages"
   :list ["Clojure" "JavaScript" "PHP" "Ruby"]})

(def libraries
  {:display "Platforms, libraries"
   :list ["shadow-cljs" "LAMP" "Ruby on Rails" "React + Redux"]})

(def web
  {:display "Web"
   :list ["HTML" "CSS" "jQuery"]})

(def other
  {:display "Other"
   :list ["MySQL" "MariaDB" "Linux" "Ansible"]})

(def all
  [languages
   libraries
   web
   other])
