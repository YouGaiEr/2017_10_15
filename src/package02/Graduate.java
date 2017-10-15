package package02;

public class Graduate extends Undergraduate {
	private String direction;
	public Graduate() {
		// TODO Auto-generated constructor stub
		this.direction="NULL";
	}
	@Override
	public String toString() {
		return "Graduate [direction=" + direction + "]";
	}
	public void show(){
		super.show();
		System.out.println(this.toString());
	}
}
