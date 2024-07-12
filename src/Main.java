import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");

		while (true) {
			System.out.printf("명령여)");

			Scanner sc = new Scanner(System.in);

			String cmd = sc.nextLine();

			System.out.println("입력된 몀령어 :" + cmd);

			if (cmd.equals("exit")) {

			}
		}

		System.out.println("== 프 로그램 끝 ==");

	}
}
