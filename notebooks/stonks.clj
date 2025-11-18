(ns stonks.clj
  (:require [tablecloth.api :as tc]
            [scicloj.clay.v2.api :as clay]
            [scicloj.tableplot.v1.plotly :as plotly]
            [scicloj.kindly.v4.kind :as kind]
            [java-time :as jt]
            [clojure.core :as c]))

(def stonk-data "data/stonks-7days.csv")

(def workshop-data
  (-> stonk-data
      (tc/dataset {:key-fn keyword})
      (tc/add-column
       :date (fn [ds]
               (map #(jt/local-date
                      (jt/zoned-date-time %))
                    (:timestamp ds))))))

(-> workshop-data
    (tc/head 3))


;; To visualize this we can plot them using Noj's tableplot tool.
;; Tableplot is a wrapper around plotting libraries. The backend we will
;; use is plotly, which is a popular plotting library in Javascript.
;; Here too the plotly api expects the resulting object in the first
;; position, and we can override the result. 

(-> workshop-data
    (tc/group-by [:symbol])
    (tc/aggregate {:avg-close #(tc/mean % :close)})
    ;; (tc/order-by :avg-close :desc) 
    (plotly/layer-bar {:=y :symbol
                       :=x :close}))


