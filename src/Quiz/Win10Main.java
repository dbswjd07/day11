package Quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Win10Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		HashMap<String,String> info = new HashMap<>();
		String calc = "calc", notepad="notepad";
		String msg = null;
		
		while(true) {
			System.out.println("1.성능(info)");
			System.out.println("2.기능 사용");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				info.put("RAM", "16GB");
				info.put("종류", "64bit");
				
				System.out.println(info);
				break;
			case 2:
				System.out.println(" 1)계산기 2)메모장 3)직접입력");
				System.out.print(">>> ");
				num = input.nextInt();
				ProcessBuilder pro = new ProcessBuilder();
				switch(num) {
				case 1:
					pro.command(calc);
					try {
						pro.start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					pro.command(notepad);
					try {
						pro.start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				case 3:
					System.out.print("입력: ");
					String s = input.next();
					pro.command(s);
					try {
						pro.start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				break;
			case 3:
				break;
			}
		}
		
		
		
	}
}
