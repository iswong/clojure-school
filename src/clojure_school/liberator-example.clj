(ns liberator-example
	(:require [liberator.core :refer [resource defresource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes ANY]]))

(defroutes app
  ANY "/" [] resource)

(def handler
  (-> app wrap-params))

(defresource hello-world
	:available-media-type ["text/plain"
  :handle-ok "Hello, world!")

