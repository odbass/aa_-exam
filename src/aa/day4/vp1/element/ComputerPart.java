package aa.day4.vp1.element;

import aa.day4.vp1.visitor.ComputerPartVisitor;

public abstract class ComputerPart {
	
	public abstract void accept(ComputerPartVisitor visitor);
}
