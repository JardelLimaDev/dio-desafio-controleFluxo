package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro:");
		int parametroUm = console.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = console.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametroInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro!");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			for (int x = 1; x <= contagem; x++) {
				System.out.println("Imprimindo o numero " + x);
			}
		} else {
			throw new ParametroInvalidosException();
		}

	}
}
