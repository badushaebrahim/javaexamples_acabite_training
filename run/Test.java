package run;
import java.util.Scanner;

import Arrayinjava.Arr.SArray;
public class Test {
	public static void main (String args[]){
		int siz;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size");
		siz= scn.nextInt();
		SArray ar= new SArray(siz);
		ar.vizArray();
	}
	
}
