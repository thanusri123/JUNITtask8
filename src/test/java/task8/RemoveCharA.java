package task8;

public class RemoveCharA {

	public static String removeAt(String str) {
		 String string = null;
		 char first=str.charAt(0);
		 char second=str.charAt(1);
		 String remainingChars=str.substring(2,str.length());
		 if(first=='A' && second=='A') {
			 return str.substring(2,str.length());
					 }
		 if(first=='A') {
			 string="";
			 return second+remainingChars;
		 }
		 
		 else if(second=='A') {
			 string="";
			 return first+remainingChars;
		 }
		 
		 else {
			 return str;
		 }
		
         }  
		
	}


