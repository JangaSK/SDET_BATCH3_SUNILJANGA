package Assignment2;

public class palindrome {

	public static void main(String[] args) {
		String string = "trurt";    
        boolean flag = true;    
            
 
        string = string.toLowerCase();    
            
           
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string trurt is palindrome");    
        else    
            System.out.println("Given string trurt is not a palindrome");    

	}

}