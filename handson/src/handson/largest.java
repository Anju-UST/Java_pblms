package handson;

public class largest {
//largest element in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {25, 11, 7, 75, 56};  
         
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  // 2 max elemnt
               max = arr[i];  
        }  
        System.out.println("Largest element in array: " + max); 

	}

}
