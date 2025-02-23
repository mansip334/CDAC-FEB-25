//Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 

class P11{
    public static void main(String args[]){
	int i = 5;
        int result = ++i + i-- ;

        System.out.println("i: "+i+" & Result " + result);
}
}