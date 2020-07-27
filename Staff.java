package personinfo;

public class Staff extends Person{
	String school=" ";
	double pay=0.0;
	public Staff(String name,String address,String school,double pay) {
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void display() {
		System.out.println("Name:"+super.name+"\nAddress:"+super.address+"\nSchool:"+school+"\nPay:"+pay);
	}
		public static void main(String[] args) {
		Staff st1=new Staff("Aung Aung","Sein Pann Ni Road","Best & bright",250000);
		Staff st2=new Staff("Aung Thu","Sein Pann Pyar Road","Myanmar IT",250000);
		
		st1.display();
		System.out.println();
		st2.display();
		System.out.println();
	}
	
}
