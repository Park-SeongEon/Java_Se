package ch03.sec11;

public class Conditiona10perationExample {

	public static void main(String[] args) {
		int score = 85;
		
		//char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); 
		
		if ( score >= 90)
			System.out.println(score + "점은 A등급입니다.");
		
		else if (score >= 80)
			System.out.println(score + "점은 B등급입니다.");
		
		else if (score >= 70)
			System.out.println(score + "점은 C등급입니다.");
		
		else if (score >= 60)
			System.out.println(score + "점은 D등급입니다.");
		else
			System.out.println(score + "점은 F등급입니다.");
		}

}
