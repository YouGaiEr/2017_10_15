
public class DepossitAccount {
	private String name;
	private int id;
	private float yue;
	public static final double lilv=0.023;
	public DepossitAccount(){
		this.id=0;
		this.name="δ����";
		this.yue=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getYue() {
		return yue;
	}
	public void setYue(float yue) {
		this.yue = yue;
	}
	/**
	 * ���
	 * @param cunk
	 */
	public void cunKuan(float cunk){
		this.yue=this.yue+cunk;
	}
	public void qukuan(float qukuan){
		if(this.yue<qukuan){
			System.out.println("����");
			return;
		}else{
			this.yue=this.yue-qukuan;
		}
	}
	/**
	 * ��������Ϣ
	 * @return
	 */
	public double lixi(){
		return (double) (this.yue*this.lilv);
	}
}
