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
		System.out.println("����������id");
		user.setId(scan.nextInt());
		System.out.println("��������������");
		user.setName(scan.next());
		System.out.println("���������Ĵ����");
		user.setYue(scan.nextFloat());
		System.out.println("������������:"+user.lilv*100+"%");
		System.out.println("�����ڴ��һ�����ϢΪ:"+user.lixi()+"Ԫ");
		this.allUser.add(user);
	}
}
