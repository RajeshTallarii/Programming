package Programs;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rajesh";
		String revStr="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			//char c=ch[i];
			revStr=ch[i]+revStr;
		}
				System.out.println(revStr);

	}

}
