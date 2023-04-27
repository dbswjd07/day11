package Quiz;

import java.util.Scanner;

public class TempService {
	TempDTO dto = new TempDTO();
	Scanner input = new Scanner(System.in);

	public void up() {
		System.out.print("올릴 온도 입력: ");
		int t = dto.getTemp();
		dto.setTemp(t+input.nextInt());
	}
	public void down() {
		System.out.print("내릴 온도 입력: ");
		int t= dto.getTemp();
		dto.setTemp(t-input.nextInt());
	}
	public void print() {
		System.out.println("현재 온도: "+dto.getTemp());
	}
}
