package Programs;

public class MethodOverloading {
	int x,y,z;
	double d;
	
	void sum() {
		x=10;
		y=20;
		System.out.println(x+y);
	}
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum(int a,double b) {
		x=a;
		d=b;
		System.out.println(x+y);
	}
	void sum(double b,int a) {
		x=a;
		d=b;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo= new MethodOverloading();
		mo.sum();
		mo.sum(10, 30);
		mo.sum(30.8,0);
		mo.sum(30,20.5);
	}

}
