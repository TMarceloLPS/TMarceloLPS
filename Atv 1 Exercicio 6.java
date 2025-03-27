import java.util.Locale;
import java.util.Scanner;

class Testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi, T, Cir, Trap, Quad, Ret;
		
		pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		T = (A * C /2);
		Cir = (pi * C * C);
		Trap = (A + B) * C /2;
		Quad = B * B;
		Ret = A * B;
		System.out.printf("TRIANGULO: %.3f%n", T);
		System.out.printf("CIRCULO: %.3f%n", Cir);
		System.out.printf("TRAPEZIO: %.3f%n", Trap);
		System.out.printf("Quadrado: %.3f%n", Quad);
		System.out.printf("RETANGULO: %.3f%n", Ret);
		
	}

}
