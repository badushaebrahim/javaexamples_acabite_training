
package Arrayinjava;
import java.util.Scanner;

public class Array1 {
	int[] arr ;
	int loc =0;
	public Array1(int SizeofArray){
		arr =new int[SizeofArray];  
	}
	void search(Scanner scn){
		int value = 0;
		try{
			System.out.println("enter value to be found");
			value = scn.nextInt();
		       }catch(Exception e){
			       System.out.println("expetion at 48 : "+e);
			      return ;
		       }
		for(int i=0;i<arr.length;i++){
			if (arr[i]== value){
				System.out.println("element :"+value+"exist at :"+i);
				break;
			}
		}
	}

	void delete(Scanner scn ){
		int index = 0;
		try {
			index = scn.nextInt();

		}catch(Exception e){
			System.out.println("expetion at  : "+e);
			return;
		}
		if (index<arr.length){
			for(int i=index;i<arr.length;i++){
				arr[i]=arr[i+1];
			}
			vizArray();
		}
	}

	 void vizArray(){
		// System.out.println(arrayLength);
			System.out.print("|");
			for (int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"|");
				// System.out.print(arr[i]);
			}
			System.out.println("");
	}
	void append(int index,int value){
		if (index<arr.length){
			arr[index]= value;
			vizArray();
		}
	}
	void inserts(Scanner scn){
		int index = 0, value=0;
		try{
			System.out.println("enter index where to insert");
			index = scn.nextInt();
			System.out.println("enter value");
			value = scn.nextInt();
		}catch (Exception e){
			System.out.println("expetion at 48 : "+e);
			return;
		}
		arr[index-1]= value;
		return;
		
	}

	public static void main(String args[]){
		boolean ch_quit = true;
		int SizeofArray =0,index=0,value=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of array");
		try{
		SizeofArray = scn.nextInt();
		}
		catch(Exception e){
			System.out.println("Exeption Code :"+e);
			System.exit(0);
		}
		Array1 ar = new Array1(SizeofArray);
		ar.vizArray();
		
		while(ch_quit){
			System.out.println("whoul you like to Continue y/n");
			try{
				char[] ch = scn.next().toCharArray();
				if (ch[0] == 'y'){
					int cho = 0;
					System.out.println("1 : append \n 2:display all \n 3 :delete at index; 4:search");
					try{
					 cho = scn.nextInt();
					}catch(Exception e){
						System.out.println("expetion at 48 : "+e);
						System.exit(0);
					}
					switch(cho){
						
						case 1:
						{
							ar.inserts(scn);
						}
						case 2:{
							ar.vizArray();
						}
						case 3 :{
							ar.delete(scn);

						}
						case 4:{
							ar.search(scn);
						}
						
					}
					
				}
				else if(ch[0] == 'n'){
					ch_quit =false;
				}
				else{
					System.out.print("invalid selection");
					ch_quit=true;
				}
			}catch(Exception e){
				System.out.println("expetion at 48 : "+e);
				System.exit(0);

			}

		
		
		
		}



	}










	
	



}
