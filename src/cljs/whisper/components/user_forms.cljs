(ns ^:figwheel-always whisper.components.user-forms
  (:require [om.core :as om :include-macros true]
          	[om.dom :as dom :include-macros true]))


(defn user-login []
  (reify
    om/IRender
    (render [_]
   	  (dom/div #js {:className "container-fluid"}
      	(dom/div #js {:className "row"})))))
