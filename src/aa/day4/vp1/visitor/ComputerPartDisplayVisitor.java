package aa.day4.vp1.visitor;

import aa.day4.vp1.element.Computer;
import aa.day4.vp1.element.Keyboard;
import aa.day4.vp1.element.Monitor;
import aa.day4.vp1.element.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Computer visit!");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Monitor visit!");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Mouse visit!");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard visit!");		
	}
	
}
