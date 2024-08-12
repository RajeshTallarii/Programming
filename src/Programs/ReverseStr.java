package Programs;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rajesh";
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			rev=ch[i]+rev;
			//System.out.print(ch[i]);
		}
		System.out.print(rev);

	}

}
