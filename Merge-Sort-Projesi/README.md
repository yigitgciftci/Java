# Merge-Sort-Projesi

Proje 2 

## [16,21,11,8,12,22] -> Merge Sort

## 1.Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
## 2.Big-O gösterimini yazınız.

# CEVAPLAR

## 1.
    [16,21,11,8,12,22]
    1.adım:[16,21,11] ve [8,12,22] ayrılır.
    2.adım:[16] ve [21,11] v [8] v [12] v [22]
    3.adım:[16] ve [11,21] v [8] v [12] v [22]
    4.adım:[11,16,21] v [8,12,22]
    5.adım:[8,11,12,16,21,22] olarak bulunur.

## 2. 
    3. ve 4. adımlarda tek tek bakıldığı için O(n) dir.
    Her bir adımda yarıya bölündüğü için 2^x=n den x=logn dir.
    Toplamda n kere logn yapıldığı için O(nlogn) olarak bulunur.
    
  (www.patika.dev)
