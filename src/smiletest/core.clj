(ns smiletest.core
  (:import [smile.clustering DeterministicAnnealing SpectralClustering]))

(def data (into-array (map (fn [id] (double-array (repeatedly 1000 #(+ id (* (rand) (rand)))))) (range 1 50 7))))

(def deterministic-annealing (DeterministicAnnealing/fit data 7))

(def spectral-clustering (SpectralClustering/fit data 4 10))
