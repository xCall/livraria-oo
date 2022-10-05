package livraria.livro;

import livraria.autor.Autor;

public class Livro {
	public String nome;
	public String descricao;
	public double valor;
	public String isbn;
	public Autor autor;

	public void mostrarDetalhes() {
		
		System.out.println("Monstrando detalhes do livro");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Valor: R$" + this.valor);
		System.out.println("ISBN" + this.isbn);
		System.out.println();
		System.out.println("Monstrando detalhes do autor");
		System.out.println("Nome: " + this.autor.nome);
		System.out.println("Email: " + this.autor.email);
		System.out.println("CPF: " + this.autor.cpf);
		System.out.print("- - - - - - - - - - - - - - - - - - - - - - ");
		
		
	}

}
