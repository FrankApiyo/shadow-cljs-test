(ns app.hello
  (:require [reagent.core :as r]
            ["react-data-grid" :default DataGrid]))

(defn click-counter [click-count]
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

(def click-count (r/atom 0))

(defn hello []
  [:> DataGrid
   {:columns [{:key 0 :name "test"}] :rows [{:id 1 :title "two"}]} ""])
