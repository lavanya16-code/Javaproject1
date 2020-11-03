package day4;
import java.lang.*;

public class Conversion {
	Integer c;
	Integer meth1(double d) {
		int e;
		e=(int)d;
		c=new Integer(e);
		System.out.println(c);
		return c;
		
	}
	float meth2(Integer c)
	{
		float g=c.intValue();
		System.out.println(g);
		return c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conversion con=new Conversion();
		con.meth1(10.0);
		con.meth2(4);
		

	}

}
