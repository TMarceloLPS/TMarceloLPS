import java.util.Locale;
import java.util.Scanner;

class Testes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double R, A, pi;
		pi = 3.14159;
		System.out.println("Digite o Raio do círculo: ");
		R = sc.nextDouble();
		A = (R * R * pi);
		System.out.println("A área deu = " + A);
		
	}

}
