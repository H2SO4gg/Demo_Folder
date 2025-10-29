public class Box
{
	private double height;
	private double width;
	private int length;
	
	public Box(){
		System.out.println("Empty Constructor called");
	}
	public Box(double height, double width, int length) {
		System.out.println("Parameterized constructor called");
		this.height=height;
		this.width=width;
		this.length=length;
	}
public void setHeight(double height){
this.height=height;
}
public void setWidth (double width){
this.width=width;	
	}
	public void setLength (int length){
		this.length=length;
}
public double getHeight(){
	return height;
}
public double getWidth(){
	return width;
}
public int getLength(){
	return length;
}
public double getArea()
{ return height*width*length;}
public void showinfo(){
	System.out.println("******Box Info*******");
	System.out.println("Height: " + height);
	System.out.println("Width: " + width);
	System.out.println("Length: " + length);
}
}