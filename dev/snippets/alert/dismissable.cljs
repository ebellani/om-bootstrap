#_
(:require [om-bootstrap.random :as r]
          [om-tools.dom :as d :include-macros true])

(r/alert {:bs-style "success"
          :on-dismiss (fn [e] (js/alert "AAAAnd its gone..."))
          :dismiss-after 1000}
         "Abrakadabra")
