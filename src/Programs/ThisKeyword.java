package Programs;

public class ThisKeyword {
	int x,y;
	//we use this keyword to reduce memory space and belong to main class
	//this always represents current class
	ThisKeyword(int a,int b){
		this.x=a;
		this.y=b;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk=new ThisKeyword(10,20);
		tk.display();
	}

}
