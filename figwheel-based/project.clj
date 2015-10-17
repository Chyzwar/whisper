(defproject whisper "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [sablono "0.3.6"]
                 [org.omcljs/om "0.9.0"]]
  
  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-npm "0.6.1"]]
    
  :source-paths ["src"]
  
  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]
  
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src"]
                        
                        :figwheel {:on-jsload "whisper.core/on-js-reload" }
                        
                        :compiler {:main whisper.core
                                   :asset-path "js/compiled/out"
                                   :output-to "resources/public/js/compiled/whisper.js"
                                   :output-dir "resources/public/js/compiled/out"
                                   :source-map-timestamp true }}
                       {:id "min"
                        :source-paths ["src"]
                        :compiler {:output-to "resources/public/js/compiled/whisper.js"
                                   :main whisper.core
                                   :optimizations :advanced
                                   :pretty-print false}}]}
  
  :figwheel {
             ;; default and assumes "resources" 
             :http-server-root "public"
             
             ;; dev server port
             :server-port 3449
              
             ;; watch and update CSS
             :css-dirs ["resources/public/css"] 
             
             ;; Start an nREPL server into the running figwheel process
             :nrepl-port 7888
             }
  
  :npm {
        ;; root folder for installing npm modules
        :root "lib/npm"
        
        ;;list npm dependencies
        :dependencies [[font-awesome "4.4.0"]
                       [jquery "2.1.4"]]})

