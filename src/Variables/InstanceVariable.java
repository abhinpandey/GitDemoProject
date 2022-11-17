package Variables;

public class InstanceVariable {
	
	int a=100;
	int b=200;
	public static void main(String[] args) {//Static area
		
		InstanceVariable v=new InstanceVariable();
		System.out.println(v.a);
		System.out.println(v.b);
		v.m1();
	}
	//
	void m1() //Instance method
	{//instance area
		System.out.println(a);
		System.out.println(b);
		
	}

}
