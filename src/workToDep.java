import java.util.LinkedList;
import java.util.Scanner;


public class workToDep {
	public Scanner scan=new Scanner(System.in);
	private LinkedList<DepossitAccount> allUser;
	public workToDep(){
		this.allUser=new LinkedList<DepossitAccount>();
	}
	public void kaihu(){
		DepossitAccount user=new DepossitAccount();
		System.out.println("请输入您的id");
		user.setId(scan.nextInt());
		System.out.println("请输入您的姓名");
		user.setName(scan.next());
		System.out.println("请输入您的存款金额");
		user.setYue(scan.nextFloat());
		System.out.println("您的年利率是:"+user.lilv*100+"%");
		System.out.println("您定期存款一年的利息为:"+user.lixi()+"元");
		this.allUser.add(user);
	}
}
