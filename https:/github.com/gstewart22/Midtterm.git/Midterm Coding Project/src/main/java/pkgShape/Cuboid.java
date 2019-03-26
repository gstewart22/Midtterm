package pkgShape;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth=iDepth;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depthSet) {
		if (depthSet<=0) {
			throw new IllegalArgumentException();
		}
		else {
			iDepth=depthSet;
		}
	}
	
	public double volume() {
		
		
		return getiWidth()*getiLength()*iDepth;
	}
	
	@Override
	public double area() {
		if (getiWidth()<=0 || getiLength()<=0 || iDepth<=0) {
			throw new IllegalArgumentException();
		}
		else{
			return 2*getiWidth()*getiLength()+2*getiWidth()*iDepth+2*getiLength()*iDepth;
		}
	}
	
	@Override
	public double perimeter() {
		if (getiWidth()<=0 || getiLength()<=0 || iDepth<=0) {
			throw new IllegalArgumentException();
		}
		else{
			return 2*getiLength()+2*getiWidth()+2*iDepth;
		}
	}
	

	public int compareTo(Cuboid cuboid) {
		if (this.area()<cuboid.area()) {
			return -1;
		}
		else if(this.area()>cuboid.area()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
