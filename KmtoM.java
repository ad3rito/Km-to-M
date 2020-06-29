import java.util.Scanner;

public class KmtoM {

	public static void main(String[] args) {

		double quilometros;

		System.out.printf("Introduza um numero de quilometros:");

		Scanner entrada = new Scanner(System.in);
		quilometros = entrada.nextDouble();

		double milhas = quilometros / 1.6;

		System.out.println(milhas + " milhas");

	}
}