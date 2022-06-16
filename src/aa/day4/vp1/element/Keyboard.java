package aa.day4.vp1.element;

import aa.day4.vp1.visitor.ComputerPartVisitor;

public class Keyboard extends ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);		
	}

}
