import java.util.Locale;
import java.util.Scanner;

class Testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Cod, Qnt, Valorun, T;
		double Cod2, Qnt2, Valorun2, U, G;
		Cod = sc.nextDouble();
		Qnt = sc.nextDouble();
		Valorun = sc.nextDouble();
		Cod2 = sc.nextDouble();
		Qnt2 = sc.nextDouble();
		Valorun2 = sc.nextDouble();
		T = (Valorun * Qnt);
		U = (Valorun2 * Qnt2);
		G = (T + U);
		System.out.printf("VALOR A PAGAR: R$ %.2f", G);
		
		
		
		
		
	}

}
