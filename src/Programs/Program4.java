package Programs;

import java.util.ArrayList;

public class Program4 {
	//JavaLearning-2024 output [JavaLearning][2024]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="JavaLearning-2024";
      ArrayList<String> arr=new ArrayList<>();
      ArrayList<String> arr1=new ArrayList<>();
      
      char ch[] =str.toCharArray();
      String k="";
      String j="";
      for(int i=0;i<ch.length;i++) {
    	  
    	  if(Character.isLetter(ch[i])) {
    		  
    		  k=k+ch[i];
    		 
    	  }
    	  else if(Character.isDigit(ch[i])) {
    		  
    		  j=j+ch[i];
    		  
    	  }
      }
      arr.add(k);
      arr1.add(j);
      System.out.print(arr);
      System.out.print(arr1);

      
	}

}
