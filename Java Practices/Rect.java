
import java.util.Scanner;

 class Rectangle {
	int length,width;
	int readattributes(){
		Scanner i = new Scanner(System.in);
		System.out.println("Enter dimensions of rectangle.Enter length :");
		length = i.nextInt();
		System.out.println("Enter the Width :");
		width = i.nextInt();
		return 1;
	}
	int perimeter(){
		System.out.println("Perimeter of rectangle is :"+(2*(length+width)));
		return 1;
	}
	int area(){
		System.out.println("Area of rectangle is:"+(length*width) );
		return 1;
	}

}

 class Rect {
public static void main(String p[]){
	Rectangle r = new Rectangle();
	r.readattributes();
	r.perimeter();
	r.area();
}
}