# BubuleSort2DArrays
Buble sorting sorts arrays in multiple passes. For instance, we have array of 5 elements { 2 , 4, 3 , 8 , 1}. 
The buble sort go over the array and swap elemnets by comparing each pair in the way 
the larger value go to left and the smaller to right(ascending order). 
So on the fisrt pass: 
2, 3, 4, 1 ,8  -  '2' and 4 no swap. 4 and 3 swap to "3 4". 3 and 8 no swap. 8 and 1 swap to "1, 8".
Second pass:
2, 3, 1 , 4, 8 
Third pass:
2, 1, 3, 4, 8
Fourth pass:
1, 2, 3, 4, 8. 

Total 4 iterations before array become sorted.
