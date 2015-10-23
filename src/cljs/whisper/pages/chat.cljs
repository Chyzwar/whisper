(ns ^:figwheel-always whisper.pages.chat
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [sablono.core :as html :refer-macros [html]]))


(defn chat-page [data]
  (om/component
    (html [:div "Hello world!"
           [:ul (for [n (range 1 10)]
                  [:li {:key n} n])]
           (html/submit-button "React!")])))