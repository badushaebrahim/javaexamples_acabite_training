package Arrayinjava;

// package Arrayinjava;
import java.util.Scanner;
public class Array1 {

	public static void main(String args[]){
		int SizeofArray =0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of array");
		try{
		SizeofArray = scn.nextInt();
		}
		catch(Exception e){
			System.out.println("Exeption Code :"+e);
			System.exit(0);
		}
		SArray ar = new SArray(SizeofArray);
		ar.vizArray();
		




	}










	
	



}
