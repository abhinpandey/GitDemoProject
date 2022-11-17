package Variables;

public class StaticVariables {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		StaticVariables v=new StaticVariables();
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
		
		v.m1();
		
	}
	
	void m1() {
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
	}

}
