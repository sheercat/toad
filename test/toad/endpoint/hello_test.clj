(ns toad.endpoint.hello-test
  (:require [clojure.test :refer :all]
            [clojure.test :refer :all]
            [kerodon.core :refer :all]
            [kerodon.test :refer :all]
            [shrubbery.core :as shrub]
            [toad.endpoint.hello :as hello]))

(def handler
  (hello/hello-endpoint {}))

(deftest smoke-test
  (testing "hello page exists"
    (-> (session handler)
        (visit "/hello")
        (has (status? 200) "page exists"))))
