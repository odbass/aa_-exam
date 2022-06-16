package aa.day4.vp1;

import java.util.ArrayList;
import java.util.List;

import aa.day4.vp1.element.Computer;
import aa.day4.vp1.element.ComputerPart;
import aa.day4.vp1.element.Keyboard;
import aa.day4.vp1.element.Monitor;
import aa.day4.vp1.element.Mouse;
import aa.day4.vp1.visitor.ComputerPartDisplayVisitor;
import aa.day4.vp1.visitor.ComputerPartVisitor;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		
		ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
		
		List<ComputerPart> computerParts = new ArrayList<ComputerPart>();
		
		ComputerPart keyboard = new Keyboard();
		ComputerPart mouse = new Mouse();
		ComputerPart monitor = new Monitor();
		
		computerParts.add(keyboard);
		computerParts.add(mouse);
		computerParts.add(monitor);
		
		ComputerPart computer = new Computer(computerParts);
		
		computer.accept(visitor);
	}

}
