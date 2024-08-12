package Programs;

public class AssignDataCode {

	int sid;
	String sname;
	char grad;

	void show() {
		System.out.println(sid + " " + sname + " " + grad);
	}

//	void setDate(int id, String name, char g) {
//		sid = id;
//		sname = name;
//		grad = g;
//	}
	AssignDataCode(int id, String name, char g){
		sid=id;
		sname=name;
		grad=g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// Approach 1 using reference variable
//		AssignDataCode student = new AssignDataCode();
//		student.sid = 100;
//		student.sname = "john";
//		student.grad = 'A';
//		// Approach 2 using method
//		student.setDate(101, "pritham", 'B');
		// Approach 3 using constructor
		AssignDataCode student = new AssignDataCode(103, "prith", 'C');
		student.show();
	}

}
