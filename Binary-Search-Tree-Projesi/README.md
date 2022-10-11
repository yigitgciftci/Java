# Binary-Search-Tree-Projesi

Proje 3

## 1.[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

## Cevap.

## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2]
  
## 1) Root 7' dir ve ağacın başına yazılır.
  
      7

## 2) 5,7'den küçük olduğu için sola yazılır.
   
      7
     /
    5

## 3) 1, 5 ve 7'den küçük olduğu için sola yazılır.
    
        7
       /
      5   
     /
    1

## 4) 8, 7'den büyük olduğu için sağa yazılır.
          
           7
          / \
         5   8
        /
       1

## 5) 3; 7 ve 5'ten küçük, 1'den büyük olduğu için 1'in sağına yazılır.
          
          7
         / \
        5   8
       /
      1
       \
        3

## 6) 6, 7'den küçük ve 5'ten büyük olduğu için 5'in sağına yazılır.
         
          7
         / \
        5   8
       / \
      1   6
       \
        3

## 7) 0, hepsinden küçük olduğu için en sola yazılır.
          
          7
         / \
        5   8
       / \
      1   6
     / \
    0   3

## 8) 9; 7 ve 8'den büyük olduğu için 8'in sağına yazılır.
          
          7
         / \
        5   8
       / \    \
      1   6    9
     / \
    0   3

 ## 9) 4; 7 ve 5'ten küçük; 1 ve 3'ten büyük olduğu için 3'ün sağına yazılır.
           
          7
         / \
        5   8
       / \    \
      1   6    9
     / \
    0   3
         \
          4

## 10) 2; 7 ve 5'ten küçük, 1'den büyük ve 3'ten küçük olduğu için 3'ün sağına yazılarak sıralama tamamlanır.
          
          7
         / \
        5   8
       / \    \
      1   6    9
     / \
    0   3
       / \
      2   4