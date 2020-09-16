import java.util.Scanner;
public class Homework4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Set up input
		System.out.print("Please Enter A Binary Number: ");
		String binary=input.nextLine();
		
		System.out.println(Homework4.binaryToHex(binary));
		
		
	}
	
	public static String binaryToHex(String binary) {
		
		int decimal=Integer.parseInt(binary,2);
		
		
		String hex="";
		String hexadecimal="0123456789ABCDEF";
		while(decimal != 0) {
			int temp=(decimal%16);
			if(temp<10) {
				hex=temp+hex;
			}
			else if(temp==10) {
				hex="A"+hex;
			}
			else if(temp==11) {
				hex="B"+hex;
			}
			else if(temp==12) {
				hex="C"+hex;
			}
			else if(temp==13) {
				hex="D"+hex;
			}
			else if(temp==14) {
				hex="E"+hex;
			}
			else if(temp==15) {
				hex="F"+hex;
			}
			//hex=(decimal%16)+hex;
			decimal=decimal/16;
		}
		return hex;
	}
}
