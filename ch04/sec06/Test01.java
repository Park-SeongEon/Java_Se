package ch04.sec06;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		int count = 0;
		String id = "ezen";
		String pass = "12345";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디:");
		String inputld = scan.next();
		
		if(!inputld.equals(id)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		else {
		while(true) {
			System.out.print("패스워드:");
			String inputPass = scan.next();
			
			if(!inputPass.equals(pass)) {
				count++;
				System.out.println("패스워드가 틀렸습니다.");
			}
			else {
				System.out.println("OK");
				break;
			}
			if(count == 3) {
				System.out.println("Get OUT!");
				break;
			}
			
		}
		}
	}
}
		
			
		
		

