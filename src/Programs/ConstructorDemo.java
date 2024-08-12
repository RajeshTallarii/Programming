package Programs;

public class ConstructorDemo {
	
	int x,y;
	String s;
	//default constructor
	ConstructorDemo(){
		x=1;
		y=2;
		s="rajesh";
	}
	//parameterized constructor
	ConstructorDemo(int a,int b,String str){
		x=a;
		y=b;
		s=str;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo();
		cd.display();
	}

}
