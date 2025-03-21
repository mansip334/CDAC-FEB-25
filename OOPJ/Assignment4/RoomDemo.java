/*Q1. Room Volume Calculation 
Design a class named Room with three data members: height, width, and breadth. Include a method 
volume() to compute and return the volume of the room. Create a separate class RoomDemo that 
creates instances of the Room class and displays the volume for each instance. */


class Room {
		int height;
		int width;
		int breadth;
		
		Room(int height,int width, int breadth){
			this.height = height;
			this.width = width;
			this.breadth = breadth;
		}
		public int volume() {
			int volume = height*width*breadth;
			return volume;
		}
	}
	class RoomDemo{
		public static void main(String[] args) {
			Room r = new Room(4,5,6);
			Room r1 = new Room(12,13,14);
			
			System.out.println("Volume of room : " + r.volume());
		}
	}
