package day4;

public class Student {
   public int id;
   public String name;
   //Student class constructor
   Student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }
   //display() method to display
   //the student data
   public void display()
	{
		System.out.println("Student id is: " + id + " " + " and Student name is: "+name);
		System.out.println();
	}

     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr;
		arr=new Student[2];
		arr[0]=new Student(51896058,"Lord Shiva");
		arr[1]=new Student(51896057,"God");
		System.out.println(
			"Student data in student arr 0: ");
		arr[0].display();
		System.out.println(
				"Student data in student arr 1: ");
		arr[1].display();
		
		}

	}


