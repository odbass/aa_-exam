package aa.day1.exam2;

public class Circle extends Ellipse {
	
	public Circle(int width) {
		super(width, width);
	}

	public void stretchX(int x) {
		stretch(x);
	}

	public void stretchY(int y) {
		stretch(y);
	}
	
	public void stretch(int r) {
		super.stretchX(r);
		super.stretchY(r);
	}
}
