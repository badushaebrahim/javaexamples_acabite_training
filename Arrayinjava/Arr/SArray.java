package Arrayinjava.Arr;

public class SArray {
	int[] arr ;
	public SArray(int SizeofArray){
		arr =new int[SizeofArray];  
	}


	public void vizArray(){
		// System.out.println(arrayLength);
			System.out.print("|");
			for (int i=0;i<arr.length;i++){
				System.out.print("_|");
			}
			System.out.println("");
	}
}
