import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Calcular calc = new Calcular();
		double operacao;
		System.out.println("Escolha a opcao: ");
		System.out.println("a - Somar: ");
		System.out.println("b - Subtrair: ");
		System.out.println("c - Multiplicar: ");
		System.out.println("d - Dividir: ");
		String op = s.next();
		System.out.println("Digite o primeiro numero: ");
		double num1 = s.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = s.nextDouble();
		switch(op) {
		case "a":
			operacao = calc.Somar(num1, num2);
			System.out.println(operacao);
			break;
		case "b":
			operacao = calc.Subtrair(num1, num2);
			System.out.println(operacao);
			break;
		case "c":
			operacao = calc.Multiplicar(num1, num2);
			System.out.println(operacao);
			break;
		case "d":
			operacao = calc.Dividir(num1, num2);
			System.out.println(operacao);
			break;
		}
		
	}

}
