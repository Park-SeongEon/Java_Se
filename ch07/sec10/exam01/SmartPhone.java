package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		//생성자 선언
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
