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
