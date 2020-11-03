package day5;
import java.util.Random;
class Phone {
	String ph_id;
	String ph_type;
	int ph_no;
	Phone(String ph_id,String ph_type,int ph_no){
		this.ph_id=ph_id;
		this.ph_type=ph_type;
		this.ph_no=ph_no;
	}

}

public class Employee {
	String empname;
	int empid;
	Phone ph_details;
public	Employee(String empname,int empid,Phone ph_details){
		this.empname=empname;
		this.empid=empid;
		this.ph_details=ph_details;
	}
	void display()
	{
		System.out.println("Employee name:"+empname+" "+"Employee id:"+empid);
		System.out.println("phone id:"+ph_details.ph_id+" "+"phone type:"+ph_details.ph_type+" "+"phone no:"+ph_details.ph_no);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone c=new Phone ("pkqr1234","Mobile",87547836);
		Phone c1=new Phone ("pkqr12345678","Landline",76393242);
		Employee employee=new  Employee("Lord shiva",875,c);
		Employee employee1=new Employee("God",876,c1);
		employee.display();
		employee1.display();
		
}

}
