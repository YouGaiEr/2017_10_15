package package02;

public class Undergraduate extends Student {
	private String specialty;
	public Undergraduate(){
		this.specialty="NULL";
	}
	@Override
	public String toString() {
		return "Undergraduate [specialty=" + specialty + "]";
	}
	public void show(){
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
}
