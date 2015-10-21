(ns ^:figwheel-always whisper.routes
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [secretary.core :as sec :refer-macros [defroute]]
            [accountant.core :as accountant]))

(accountant/configure-navigation!)

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


(defroute wildcard "*" []
  (accountant/navigate! "/"))

(accountant/navigate! "/login")