(ns site.data.experience)

(def vcs-highlights
  ["Applied development best practices to create full-featured web applications"
   "Provided feedback to teammates during daily code reviews"
   "Created user stories based on application specifications"])

(def vcs
  {:title "Web Development Apprentice"
   :organization "Viking Code School"
   :start "Oct 2016"
   :end "Feb 2017"
   :highlights vcs-highlights})

(def purdue-highlights
  ["Built platform for sharing, leading intercultural learning activities used at over 80 universities"
   "Developed data collection system used by physicians at 18 hospitals across the U.S."
   "Investigated and resolved user-reported software defects across the full stack"
   "Deployed critical updates to over 20 client systems"])

(def purdue
  {:title "Full Stack Developer"
   :organization "Purdue"
   :start "May 2017"
   :end "Sep 2019"
   :highlights purdue-highlights})

(def ucsd-highlights
  ["Technical lead on contract-based client projects"
   "Key member on team transitioning core product from PHP monolith to Clojure microservices"
   "Reduced ticket processing workload by 85% through development of automated aggregation system"
   "Drove organization-wide adoption of SCRUM-based development practices"
   "Increased new feature test coverage by 70%"])

(def ucsd
  {:title "Software Engineer"
   :organization "UCSD"
   :start "Sep 2019"
   :end "Present"
   :highlights ucsd-highlights})

(def all
  [ucsd
   purdue
   vcs])
