(ns toad.endpoint.hello
  (:require [compojure.core :refer :all]))

(defn hello-endpoint [config]
  (context "/hello" []
           (routes
            (GET "/" [] "Hello World"))))
