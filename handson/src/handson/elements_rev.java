package handson;

public class elements_rev {
//printing elements in reverse order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {11, 21, 34, 43, 75};  
        System.out.println("array elements: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        //System.out.println();  
        System.out.println("Array in reverse order: ");  
         
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
