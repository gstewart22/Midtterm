package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		this.iWidth=iWidth;
		this.iLength=iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int widthSet) {
		if (widthSet<=0) {
			throw new IllegalArgumentException();
		}
		else {
			iWidth=widthSet;
		}
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int lengthSet) {
		if (lengthSet<=0) {
			throw new IllegalArgumentException();
		}
		else {
			iLength=lengthSet;
		}
	}
	
	public double area() {
		if (iWidth<=0 || iLength<=0) {
			throw new IllegalArgumentException();
		}
		else{
			return iWidth*iLength;
		}
	}
	
	public double perimeter() {
		if (iWidth<=0 || iLength<=0) {
			throw new IllegalArgumentException();
		}
		else{
			return (2*iWidth)+(2*iLength);
		}
	}
	
	public int compareTo(Rectangle rectangle) {
		if (this.area()<rectangle.area()) {
			return -1;
		}
		else if(this.area()>rectangle.area()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

