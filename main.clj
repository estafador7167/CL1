(defn Example[]
  (def cust "2|Sue Jones|43 Rue court street|5653-6763-565\n3|Fan Yuhong|165 Happy Lane|6763-673-87\n1|John Smith|123 Here street|256-278-68")
  (def x(clojure.string/split-lines cust))
  (def num(count x))
  ;;(println num)
  (def a1(atom 0))
  (defn abc[num]
   (def a2(clojure.string/split (get x @a1) #"\|"))
   (def a3(Integer/parseInt(get a2 0)))
   (def a4(str (get a2 1) "," (get a2 2) "," (get a2 3)))
   ;;(print a3)
   ;;(println " " a4)
   (if(= 0 @a1)
         (def customern(sorted-map (get a2 1) a3))
         (def customern(assoc customern (get a2 1) a3)))
   (if(= 0 @a1)
          (def customeri(sorted-map a3 (get a2 1)))
          (def customeri(assoc customeri a3 (get a2 1))))
   (if(= 0 @a1)
         (def area1(sorted-map a3 a4))
         (def area1(assoc area1 a3 a4 )))
   (swap! a1 inc)
    (if(< 1 num)
         ( abc(dec num))))
 (abc num)
 (println "cust...")
 ;;(println area1)
 (println "customer...")
 ;;(println customern)
;; (println customeri)
 ;;prod...................................
 (def prod "3|jam|2.99\n5|eggs|2.98\n1|shoes|14.96\n6|jacket|42.99\n2|milk|1.98\n4|gum|1.25")
 (def y(clojure.string/split-lines prod))
 (def num1(count y))
 (println num1)
 (def b1(atom 0))
 (defn abc1[num1]
   (def b2(clojure.string/split (get y @b1) #"\|"))
   (def b3(Integer/parseInt(get b2 0)))
   (def b4(str (get b2 1) "," (get b2 2)))
   (if(= 0 @b1)
         (def productu(sorted-map b3 (Float/parseFloat(get b2 2))))
         (def productu(assoc productu b3 (Float/parseFloat(get b2 2)))))
   (if(= 0 @b1)
         (def producti(sorted-map b3 (get b2 1)))
         (def producti(assoc producti b3 (get b2 1))))
   (if(= 0 @b1)
         (def area2(sorted-map b3 b4))
         (def area2(assoc area2 b3 b4)))
    (swap! b1 inc)   
    (if(< 1 num1)
          (abc1(dec num1))))
  (abc1 num1)
  (println "prod...")
  ;;(println area2)
  (println "product....")
 ;; (println productu)
 ;; (println producti)
  ;;sales............
  (def sales "1|1|1|3\n2|2|2|3\n3|2|1|1\n4|3|3|4")
  (def z(clojure.string/split-lines sales))
  (def num2(count z))
  (println z)
  (def c1(atom 0))
  (defn abc2[num2]
    (def c2(clojure.string/split (get z @c1) #"\|"))
    (def c3(Integer/parseInt(get c2 0)))
    (def d1(Integer/parseInt(get c2 1)))
    (def d2(Integer/parseInt(get c2 2)))
    (def e1(get customeri d1))
    (println e1)
    (def e2(get producti d2))
    (def c4(str e1 "," e2 ","(get c2 3)))
    (def f1 (Float/parseFloat (get c2 3)))
    (def f2 (get productu d2))
    (def f3(* f2 f1))
    (println f3)
    (if(= 0 @c1)
         (def tsales(sorted-map e1 f3))
         ((def g(str(contains? tsales e1)))
           (if(= g "true")
                 ((def h(get tsales e1))
                       (println h))
                     (def tsales(sorted-map e1 f3)))))
                       
    (if(= 0 @c1)
          (def area3(sorted-map c3 c4))
          (def area3(assoc area3 c3 c4)))
    (swap! c1 inc)
    (if(< 1 num2)
          (abc2(dec num2))))
  (abc2 num2)
  (println "sales...")
  (println area3)
  (println "total sales...")
  (println tsales))
(Example)