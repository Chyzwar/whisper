(ns ^:figwheel-always whisper.routes
  (:require [om.core :as om :include-macros true]
            [secretary.core :as sec :refer-macros [defroute]]
            [accountant.core :as accountant]
            [whisper.pages.login :as login]
            [whisper.pages.chat :as chat]))

(accountant/configure-navigation!)

(defroute main-page "/" []
  (om/root chat/chat-page
           {}
           {:target (. js/document (getElementById "app"))}))


(defroute login-page "/login" []
  (om/root login/login-page
           {}
           {:target (. js/document (getElementById "app"))}))


(defroute wildcard "*" []
  (accountant/navigate! "/"))


(defn on-js-reload []
  (accountant/configure-navigation!))

(accountant/navigate! "/login")