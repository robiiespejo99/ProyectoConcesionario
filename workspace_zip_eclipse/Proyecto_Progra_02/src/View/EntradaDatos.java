package View;

import java.util.Scanner;

public class EntradaDatos {
	public static int readInt(String msg, Scanner scanner) {
		int rsp = 0;
		while (true) {
			try {
				System.out.print(msg);
				rsp = scanner.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Solo se puede ingresar enteros!");
			}
		}
		return rsp;
	}

	public static String readString(String msg, Scanner scanner) {
		String rsp = "";
		System.out.print(msg);
		rsp = scanner.nextLine();

		return rsp;
	}
	
	public static double readDouble(String msg, Scanner scanner) {
		double rsp = 0;
		while (true) {
			try {
				System.out.print(msg);
				rsp = scanner.nextDouble();
				break;
			}catch (java.util.InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Solo se puede ingresar valores de tipo double!");
			}
		}
		return rsp;
	}
}
