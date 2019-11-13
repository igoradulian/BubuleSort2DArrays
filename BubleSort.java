/*For two dimensional array working the same approach as for one dimensional. Fisrt it is 
more easier to transform with two dimensional array to one dimensional array. Then array
can be sorted the same way as one dimensional array. The only difference that 2D array looks like as matrix.
*/



public class BubleSort

{

   public static void main (String []args)
   
   {
   
      int [][] array  = { {2, 7, 4},
                         {8, 1, 6},   
                         {9, 5, 3}};
                         
      int [] arraySingle  = new int [9];
      int n = 0;
                         
      boolean swap = true; 
      int temp;
                        
      for(int i = 0; i < array.length; i++)
         {
         for(int j = 0; j < array[i].length; j++)
            {
                    
                       
                      arraySingle [n] =  array[i][j];
                      
                        n++; 
                      
                    //  System.out.print( arraySingle [i] );
                       
              }
            
        }
        
        for(int i = 0; i < arraySingle.length; i++)
        System.out.print( arraySingle [i] ); 
            
        System.out.println("\n");
        
        
    
        
     for(int k = 1 ; k < arraySingle.length && swap; k++) 
     {
         swap = false;
        
        for(int i = 0; i < arraySingle.length - k; i++)
               {
                  if( arraySingle[i] > arraySingle[i+1])
                  {

                      temp = arraySingle[i];

                      arraySingle[i] = arraySingle[i + 1];

                      arraySingle[i + 1] = temp;
                      
                      swap = true;                      
                     
                      
                      }
                }
            }
          
       for(int i = 0; i < arraySingle.length; i++)   
                  System.out.print(arraySingle[i]);

        
 }
 }
