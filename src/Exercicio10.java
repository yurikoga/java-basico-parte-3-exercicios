public class Exercicio10 {
	static String parOuImpar(int numero) {
		return numero % 2 == 0 ? "PAR" : "IMPAR";
	}

	public static void main(String[] args) {
		System.out.println("8 é: " + parOuImpar(8));
		System.out.println("13 é: " + parOuImpar(13));
	}
}