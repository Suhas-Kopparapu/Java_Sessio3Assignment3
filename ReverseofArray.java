package Session3;

import java.util.Scanner;

public class ReverseofArray {


	public static void main(String[] args) {
		
		int n;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n= sc1.nextInt();
		
		int[] arr1 = new int[n];
		 
		//entering the values in the array
		for(int  i=0;i<n;i++){
			System.out.println("Enter the " +i +"value of array :");
			Scanner sc2 = new Scanner(System.in);
			arr1[i] = sc2.nextInt();
			
		}
		//System.out.println("Printing the value of array");
	
	//printing reverse of the array
		//
		for(int j=0,m=n;j<(n/2);j++,m--){
			int temp =0;
			temp = arr1[j];
			arr1[j] = arr1[m-1];
			arr1[m-1] = temp;
		
		}
		System.out.println("printing reverse of array");
			for(int k=0;k<n;k++){
		System.out.println(arr1[k]);
	}
		

	}

}
