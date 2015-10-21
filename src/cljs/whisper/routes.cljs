(ns ^:figwheel-always whisper.routes
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [secretary.core :as secretary :refer-macros [defroute]]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.History))


(def application
  (js/document.getElementById "application"))

(defn set-html! [el content]
  (aset el "innerHTML" content))

(defn widget [data owner]
  (reify
    om/IRender
    (render [this]
            (dom/h1 nil (:text data)))))


(defroute main-page "/" []
  (om/root widget {:text "Main Page"}
           {:target (. js/document (getElementById "app"))})
  
  (js/console.log (str "U chuja main page")))


(defroute login-page "/login" []
  (om/root widget {:text "Login Page"}
           {:target (. js/document (getElementById "app"))})
  (js/console.log (str "U chuja")))


;; Catch all
(defroute wildcard "*" []
  (set-html! application "<h1>LOL! YOU LOST!</h1>"))

;; Quick and dirty history configuration.
(let [h (History.)]
  (goog.events/listen h EventType/NAVIGATE #(secretary/uri-dispatcher (.-token %)))
  (doto h (.setEnabled true)))
