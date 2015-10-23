(ns ^:figwheel-always whisper.pages.login
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [whisper.components.user-forms :as form]))


(defn login-page [data owner]
  (reify
    om/IRender
    (render [_]
   	  (dom/div #js {:className "container-fluid"}
        (dom/div #js {:className "row"})
        (om/build form/user-login ())))))