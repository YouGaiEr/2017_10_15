package package02;

public class Student {
	private String name;
	private int age;
	private String education;
	Student(){
		this.age=0;
		this.education="NULL";
		this.name="NULL";
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", education="
				+ education + "]";
	}
	public void show(){
		System.out.println(this.toString());
	}
}
