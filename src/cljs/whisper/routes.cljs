(ns ^:figwheel-always whisper.routes
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [secretary.core :as secretary :refer-macros [defroute]]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.History))

(secretary/set-config! :prefix "#")


(defn widget [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/h1 nil (:text data)))))


(defroute login-page "/login" []
              (om/root widget {:text "Login Page"}
                       {:target (. js/document (getElementById "app"))})
              (js/console.log (str "U chuja")))

(defroute main-page "/" []
              (om/root widget {:text "Main Page"}
                       {:target (. js/document (getElementById "app"))})
              
              (js/console.log (str "U chuja main page")))

(let [history (History.)
      navigation EventType/NAVIGATE]
  (goog.events/listen history
                     navigation
                     #(-> % .-token secretary/dispatch!))
  (doto history (.setEnabled true)))

(defn main []
  (-> js/document
      .-location
      (set! "#/")))
(main)