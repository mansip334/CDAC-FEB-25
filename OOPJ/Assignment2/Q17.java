//Implement a Java program that finds the  minimum of four numbers  using nested 
//ternary operators. 

 class Q17{
	public static void main(String[] args){
		int x = 6;
		int y = 8;
		int z = 5;
		int a = 4;
	
		int res = (x<y && x<z && x<a)? x:(y<x && y<z && y<a)? y:(z<x && z<y && z<a)? z: a;
		System.out.println(res);
	}
}	


