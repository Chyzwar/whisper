(defproject whisper "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [sablono "0.3.6"]
                 [prismatic/om-tools "0.3.12"]
                 [org.omcljs/om "0.9.0"]
                 [secretary "1.2.3"]
                 [venantius/accountant "0.1.2"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.4.1"]
            [lein-npm "0.6.1"]
            [lein-sass "0.3.7"]]

  :source-paths ["src/cljs"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src/cljs"]

                        :figwheel {:on-jsload "whisper.routes/on-js-reload" }

                        :compiler {:main whisper.routes
                                   :asset-path "js/compiled/out"
                                   :output-to "resources/public/js/compiled/whisper.js"
                                   :output-dir "resources/public/js/compiled/out"
                                   :source-map-timestamp true }}
                       {:id "min"
                        :source-paths ["src/whisper"]
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
             :css-dirs ["resources/public"]

             ;; Start an nREPL server into the running figwheel process
             :nrepl-port 7888
             }
  :sass {
         :src "src/scss"
         :output-directory "resources/public/css"
         :delete-output-dir true
         :source-maps true
         :style :nested
         }

  :npm {
        ;; root folder for installing npm modules
        :root "lib"

        :package {:scripts
                  ;;run browserify on js resources
                  {
                    ;; lein npm run build
                    :build "
                          browserify --debug ../src/js/main.js |
                          uglifyjs -mc > ../resources/public/js/compiled/bundle.min.js" 

                    ;; lein npm run watch
                    :watch "
                          watchify ../src/js/main.js -o ../resources/public/js/compiled/bundle.js -d" }}

        ;;list npm dependencies
        :dependencies [[font-awesome "4.4.0"]
                       [jquery "2.1.4"]
                       [browserify "11.2.0"]
                       [reactify "^0.5.1"]
                       [uglify-js "^2.5.0"]
                       [watchify "3.4.0"]]})

