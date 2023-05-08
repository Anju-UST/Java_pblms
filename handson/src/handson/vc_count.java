package handson;

public class vc_count {
//count vowels and consonants in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vCount = 0, cCount = 0;    
        
            
        String str = "I am doing FSD Training ";    
            
        
        str = str.toLowerCase();    
            
        for(int i = 0; i< str.length(); i++) {    
               
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                  
                vCount++;    
            }    
                
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                   
                cCount++;    
            }    
        }    
        System.out.println("vowels: " + vCount);    
        System.out.println("consonants: " + cCount);    

	}

}
