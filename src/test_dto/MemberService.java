package test_dto;

import java.util.Scanner;

public class MemberService {
	Scanner input = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	
	public void inputName() {
		
		System.out.println("이름 입력");
		String name = input.next();
		dto.setName(name);
	}
	
	public void inputAge() {
		System.out.println("나이 입력");
		//age = input.nextInt();
		dto.setAge(input.nextInt());
	}
	
	public void print() {
		System.out.println("이름 : "+dto.getName());
		
		int age = dto.getAge();
		System.out.println("나이 : "+age);
	}
	
}
