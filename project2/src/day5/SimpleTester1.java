package day5;

public class SimpleTester1 implements PrimeTester {
		public void primecheck(int b)
		{
			int count=0;
			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("It is a prime");
			}
			else
			{
				System.out.println("It is not a prime");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTester1 obj=new SimpleTester1();
		obj.primecheck(2);
	}

}


	