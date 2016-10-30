(ns clj-art.math)

(defn v* 
  ([a] a)  
  ([a b] (map * a b))
  ([a b & more] (reduce v* (v* a b) more)))

(defn v+ 
  ([a] a)  
  ([a b] (map + a b))
  ([a b & more] (reduce v+ (v+ a b) more)))

(defn v- 
  ([a] a)  
  ([a b] (map - a b))
  ([a b & more] (reduce v- (v- a b) more)))

(defn dot [v1 v2]
  (reduce + (v* v1 v2)))

(defn mv* [m v]
  (map #(dot v %) m))

(defn abs-value [x]
  (if (< x 0) (- x) x))

(defn sig [x]
  (/ 1 (+ 1 (Math/exp (- (* x 5))))))

(defn tanh [x]
  (- (* 2 (sig (* 2 x))) 1))

(defn rand-vec [n]
  (repeatedly n #(if (< (rand) 0.5) (rand) (- (rand)))))

(defn rand-matrix [n, m]
  (repeatedly n #(rand-vec m)))

