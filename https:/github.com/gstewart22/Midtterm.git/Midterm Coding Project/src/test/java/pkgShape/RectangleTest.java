package pkgShape;

import static org.junit.Assert.*;

public class RectangleTest {
	
	@Test
	public void TestRectangleSetiLength() {
		Rectangle r = new Rectangle(1,2);
		
		try{
			r.setiLength(5);
		}
		catch(Exception e) {
			System.out.println("Illegal length argument.");
		}
	}
	
	@Test
	public void TestRectangleSetiWidth() {
		Rectangle r = new Rectangle(1,2);
		
		try{
			r.setiLength(3);
		}
		catch(Exception e) {
			System.out.println("Illegal width argument.");
		}
	}
}
