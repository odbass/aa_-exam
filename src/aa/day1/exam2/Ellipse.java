package aa.day1.exam2;

public class Ellipse {
	
	private int x;
	private int y;
	
	public Ellipse (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void stretchX(int x) {
		this.x += x;
	}
	
	public void stretchY(int y) {
		this.y += y;
	}
	
	
}
