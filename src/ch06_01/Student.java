package ch06_01;

public class Student {
	
	//눈에는 안보이지만 객체명과 같은 생성자 메소드가 존재한다. 맞나 쌤이 해준이야기
	
	//속성, 필드, 멤버변수
	String schoolName = "ABC학교";
	String name;   // 이름
	int age;       // 나이
	String hakqun; // 학번
	int grade;     // 학년
	
	//메소드(클래스 내에 선언된 함수)
	public void study() {
		System.out.println(name + " 친구 공부합시다!!!");
	}
	
	public void play() {
		System.out.println(name + " 친구 놀러갑시다!!!");
	}


}
