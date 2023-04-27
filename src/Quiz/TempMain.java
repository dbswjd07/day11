package Quiz;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		TempService ts = new TempService();
		
		while(true) {
			System.out.println("1.온도 올리기");
			System.out.println("2.온도 내리기");
			System.out.println("3.현재 설정 정보");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				ts.up();
				break;
			case 2:
				ts.down();
				break;
			case 3:
				ts.print();
			}
		}
	}
}
