(ns ^:figwheel-always whisper.components.user-forms
  (:require [om.core :as om :include-macros true]
          	[om.dom :as dom :include-macros true]))

(defn input [{:keys [placeholder id-name]} owner
             {:keys [state opts], {:keys [addon styles]} :opts}]
  (js/console.log owner)
  (reify
    om/IDisplayName
    (display-name [_]
      (str "input-field"))

    om/IInitState
    (init-state [_]
       {})

    om/IRenderState
    (render-state [_ state]

      (dom/div #js {:className "form-group"}
        (dom/div #js {:className "input-group"}
        (if addon
          (dom/div #js {:className "input-group-addon"} addon))
            (dom/input #js
                      {:id id-name
                      :name id-name
                      :value (:value state)
                      :placeholder placeholder
                      :style (:input styles)}))))))


(defn user-login [state owner]
  (reify
    om/IDisplayName
    (display-name [_]
      (str "user-login-form"))

    om/IInitState
    (init-state [_]
       {:username {:value "chuj"}
        :password {:value nil}})

    om/IRenderState
    (render-state [_ state]
      (let [styles
            {:input #js {:backgroundColor "red"}}]

   	  (dom/form #js {:className "user-login"}
        (om/build input
                  {:placeholder "Username" :id-name "username"}
                  {:state (:username state) :opts {:addon "$$" :styles styles}})

        (om/build input
                  {:placeholder "Password" :id-name "password"}
                  {:state (:password state) :opts {:addon "$$" :styles styles}}))))))
