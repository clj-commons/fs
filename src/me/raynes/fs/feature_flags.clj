(ns me.raynes.fs.feature-flags
  "Compile-time feature flags.

  In order to use them:

  * `require` this ns before any other ns from this lib.
  * `alter-var-root` a given feature flag within this ns to a different, desired value
  * proceed to `require` the rest of this library.")

(def extend-coercions?
  "Should the clojure.java.io/Coercions protocol be extended by this library?"
  true)
