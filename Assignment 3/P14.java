/*program to print the following pattern: 
 * 
 ** 
 *** 
 ***** 
 ******* 
 *********
*/
class P14{
    public static void main(String args[]){
	  for (int i = 1; i <= 9; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   