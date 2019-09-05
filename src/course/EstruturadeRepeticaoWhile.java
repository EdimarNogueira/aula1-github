package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturadeRepeticaoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com Número");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Entre com outro Número ");
			n = sc.nextDouble();
		}
		System.out.println("Número Negativo");
		sc.close();
	}

}
