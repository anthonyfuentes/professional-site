(ns site.data.experience)

(def sunrise-highlights
  ["You think water moves fast? You should see ice."
   "It moves like it has a mind."])

(def sunrise
  {:title "HR Technical Lead"
   :organization "Sunrise Management"
   :start "Mar 2015"
   :end "Apr 2016"
   :highlights sunrise-highlights})

(def vcs-highlights
  ["I should've known way back when... You know why, David?"
   "Because of the kids. They called me Mr Glass."])

(def vcs
  {:title "Web Development Apprentice"
   :organization "Viking Code School"
   :start "Oct 2016"
   :end "Feb 2017"
   :highlights vcs-highlights})

(def purdue-highlights
  ["Well, the way they make shows is, they make one show. That show's called a pilot."
   "Some pilots get picked and become television programs. Some don't, become nothing."
   "She starred in one of the ones that became nothing."])

(def purdue
  {:title "Full Stack Developer"
   :organization "Purdue Research Computing"
   :start "May 2017"
   :end "Sep 2019"
   :highlights purdue-highlights})

(def ucsd-highlights
  ["The path of the righteous man is beset on all sides"
   "Blessed is he who shepherds the weak through the valley of darkness"
   "And I will strike down those who would attempt to poison and destroy"])

(def ucsd
  {:title "Application Programmer"
   :organization "UCSD Supercomputer Center"
   :start "Sep 2019"
   :end "Present"
   :highlights ucsd-highlights})

(def all
  [ucsd
   purdue
   vcs
   sunrise])
