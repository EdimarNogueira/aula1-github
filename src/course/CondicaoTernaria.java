package course;

import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		// Express�o Condi��o tern�ria
		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
		sc.close();
	}

}
