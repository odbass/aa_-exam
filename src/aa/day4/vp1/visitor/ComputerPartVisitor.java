package aa.day4.vp1.visitor;

import aa.day4.vp1.element.Computer;
import aa.day4.vp1.element.Keyboard;
import aa.day4.vp1.element.Monitor;
import aa.day4.vp1.element.Mouse;

public interface ComputerPartVisitor {
	
	public void visit(Computer computer);
	public void visit(Monitor monitor);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	
}
