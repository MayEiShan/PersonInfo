package personinfo;

public class Student extends Person{
	public String program=" ";
	public int year= 0;
	public double fee=0.0;
	public Student(String name,String address,String program,int year,double fee) {
	super(name,address);
	this.program=program;
	this.year=year;
	this.fee=fee;
	
	}
	public void display() {
		System.out.println("Name:"+super.name+"\nAddress:"+super.address+"\nProgram:"+program+"\nYear:"+year+"\nFee:"+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st=new Student("Ma Ma","Main Road","Leadership",1,100000);
		Student st1=new Student("Su Su","Nilar Road","Management",2,400000);
		Student st2=new Student("Aye Aye","Yandar Road","Acounting",3,300000);
		st.display();
		System.out.println();
		st1.display();
		System.out.println();
		st2.display();
		System.out.println();
	}

}
