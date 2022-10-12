package Arrayinjava;

public class SArray {
	int[] arr ;
	SArray(int SizeofArray){
		arr =new int[SizeofArray];  
	}


	void vizArray(){
		// System.out.println(arrayLength);
			System.out.print("|");
			for (int i=0;i<arr.length;i++){
				System.out.print("_|");
			}
			System.out.println("");
	}
}
