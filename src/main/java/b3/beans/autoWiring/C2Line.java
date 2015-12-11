package b3.beans.autoWiring;

// A line is defined with two points 
public class C2Line {
	private C1Point start;
	private C1Point end;
	
	public void draw(){
		System.out.println("The line created");
		System.out.println("Point A is (" + this.start.getX() +","+this.start.getY() +")");
		System.out.println("Point B is (" + this.end.getX() +","+this.end.getY() +")");

	}
	
	public C1Point getStart() {
		return start;
	}
	public void setStart(C1Point start) {
		this.start = start;
	}
	public C1Point getEnd() {
		return end;
	}
	public void setEnd(C1Point end) {
		this.end = end;
	}
}
