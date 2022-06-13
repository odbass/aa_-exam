package aa.day1.exam2;

public class Circle extends Ellipse {
	
	public Circle(int width) {
		super(width, width);
	}

	public void stretchX(int x) {
		stretchX(x);
		stretchY(x);
	}

	public void stretchY(int y) {
		stretchX(y);
		stretchY(y);
	}
	
	public void stretch(int r) {
		stretchX(r);
		stretchY(r);
	}
}
