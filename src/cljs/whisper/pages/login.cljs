(ns ^:figwheel-always whisper.pages.login
  (:require [om.core :as om :include-macros true]
          	[sablono.core :as html :refer-macros [html]]))


(defn login-page [data]
  (om/component
   (html [:div "Hello world!"
          [:ul (for [n (range 1 10)]
                 [:li {:key n} n])]
          (html/submit-button "React!")])))