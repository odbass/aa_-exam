package aa.day4.vp1.element;

import java.util.ArrayList;
import java.util.List;

import aa.day4.vp1.visitor.ComputerPartVisitor;

public class Computer extends ComputerPart {

	List<ComputerPart> parts = new ArrayList<ComputerPart>();
	
	public Computer(List<ComputerPart> parts) {
		this.parts = parts;
	}
	
	@Override
	public void accept(ComputerPartVisitor visitor) {
		parts.stream().forEach(part -> {
			part.accept(visitor);
		});
	}

}
