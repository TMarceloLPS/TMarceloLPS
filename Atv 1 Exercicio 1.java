import java.util.Scanner;

class Testes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, a;
		
		System.out.println("Digite o Primeiro número: ");
		x = sc.nextInt();
		
		System.out.println("Digite o Segundo número: ");
		y = sc.nextInt();
		System.out.println("Voce digitou :" + x + " e " + y);
		a = (x + y);
		System.out.println("A soma = " + a);
		
	}

}
