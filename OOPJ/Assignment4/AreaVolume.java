/*Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. Include appropriate 
constructors to initialize these variables. Also, implement two methods: 
  getVolume() to return the volume of the box 
  getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas.*/

class Box{
	int height;
	int width;
	int breadth;
	
	Box(int height,int width,int breadth){
		this.height = height;
		this.width=width;
		this.breadth=breadth;	
	}
	public int getVolume() {
		return height*width*breadth;
	}
	public int getArea() {
		return width * height;
	}	
}
public class AreaVolume {
	public static void main(String[] args) {
		Box b = new Box(2,4,2);
		System.out.println("Area: "+b.getArea());
		System.out.println("Volume: "+b.getVolume());
	}
}