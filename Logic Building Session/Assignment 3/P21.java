/*program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9
*/

class P21{
    public static void main(String args[]){
	for (int i = 1; i <= 5; i++) {
            int num = 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print("*");
                }
                num = num + 2; 
            }
            System.out.println();
        }
    }
}