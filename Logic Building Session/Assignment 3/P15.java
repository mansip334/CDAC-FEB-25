/*a program to print the following pattern: 
    *
   * *
  * * *
 * * * *
* * * * *
*/
class P15{
    public static void main(String args[]){
	int n = 5;
	for(int i = 1; i <= n; i++) {        //rows
		for(int j = 1; j <= n - i; j++) {    //spaces
			System.out.print(" ");
		}
		for(int j = 1; j <= n; j++) {    //col
			if (i >= j) {
			System.out.print("* ");
		} else {
                        System.out.print("  ");
		}
		}
			System.out.println();
		}
	}
}