# Insertion-Sort-Projesi

Proje 1

## [22,27,16,2,18,6] -> Insertion Sort

## 1.Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

## 2.Big-O gösterimini yazınız.

## 3.Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.

## 4.Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

## 5.[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

# Cevaplar

## 1.
    [22,27,16,2,18,6] 

    1.adım: [2] ve [22] yer değişir.

    [2],[27,16,22,18,6]

    2.adım: [27] ve [6] yer değişir.

    [2,6],[16,22,18,27]

    [2,6,16],[22,18,27]

    3.adım: [22] ve [18] yer değişir.

    [2,6,16,18,22,27] olarak bulunur.


## 2.
    Tek tek bakıldığı için O(n) olarak bulunur.


## 3.
    Average Case: Yukarıda hesaplandığı gibi 3 olarak bulunur.

    Worst Case: 6 sayı bulunmakta 6+5+4+3+2+1+0=21


## 4.
    [2,6,16,18,22,27] sıralanır. [18]e bakıldığında 6 elemandan 4.sırada bulunduğu için 
    AVERAGE CASE durumu olarak nitelendirilir.


## 5.
    [7,3,5,8,2,9,4,15,6]

    1.adım: [2] ve [7] yer değişir.

    [2],[3,5,8,7,9,4,15,6]

    [2,3],[5,8,7,9,4,15,6]

    2.adım: [5] ve [4] yer değişir.

    [2,3,4],[8,7,9,5,15,6]

    3.adım: [5] ve [8] yer değişir.

    [2,3,4,5],[7,9,8,15,6]

    4.adım: [7] ve [6] yer değişir.

    [2,3,4,5,6],[9,8,15,7] olarak devam eder.
    
  (www.patika.dev)
