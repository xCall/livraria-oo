package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava8;
		double livroTDD;

		livroJava8 = 59.90;
		livroTDD = 59.90;

//		double soma = livroJava8 + livroTDD;
		
		double soma = 0;
		int contador = 0;
		while(contador < 35) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador += 1;
		}

		System.out.println("O total em estoque e: " + soma);
		if (soma < 150) {
			System.out.println("Seu estoque esta muito baixo!");
		} else if(soma >= 2000) {
			System.out.println("Seu estoque esta muito alto!");
		}
		else {
			System.out.println("Seu estoque esta bom!");
		}
	}
}
