package LC_506;

public class Main {
	public static void main(String[]args) {
		Inbody inbody=new Inbody(170,68.6);
		
		System.out.println("My height");
		System.out.println(inbody.getHeight());
		System.out.println("My weight");
		System.out.println(String.format("%.6f",inbody.getWeight()));
	}
	
	
}

class Inbody{
	private int height;
	private double weight;
	
	public Inbody(int height,double weight) {
		this.height=height;
		this.weight=weight;
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public double getWeight() {
		return weight;
	}
}