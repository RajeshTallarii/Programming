package Programs;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JavaLearning2024 output 2024
		//JavaLearning-2024 output [JavaLearning][2024]
		//I Love Java  output avaJ evoL I 
		//I Love Java  output Java Love I
		String str="JavaLearning2024";
		String ResStr="";
		char ch[] =str.toCharArray();
		//int j=48;
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			int j=0;
			j=(int)c;
			
			
			//System.out.println((int)c);
			if(j>=48&&j<=57) {
				System.out.print(ch[i]);
			}
			
		}
//		for(int i=0;i<ch.length;i++) {
//			if(Character.isDigit(ch[i])) {
//				System.out.print(ch[i]);
//			}
//		}
		//System.out.println();

	}

}
