package handson;

public class evenpos {
// elements in even position
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1, 2, 13, 4, 5,64,44, 78};
		  
        System.out.println(" even position elements: ");    
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  

	}

}
// 