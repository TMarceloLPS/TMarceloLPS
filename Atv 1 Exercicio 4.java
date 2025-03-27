import java.util.Locale;
import java.util.Scanner;

class Testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int A, D;
		double F;
		double H;
		double Reais;
		A = sc.nextInt();
		H = sc.nextDouble();
		Reais = sc.nextDouble();
		F = (H * Reais);
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = U$ %.2f", F);
		
		
		
	}

}
