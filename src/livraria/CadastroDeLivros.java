package livraria;

import livraria.autor.Autor;
import livraria.livro.Livro;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();

		livro.nome = "Java 8 prático";
		livro.descricao = "Novos Recursos da linguagem.";
		livro.valor = 59.90;
		livro.isbn = "987-85-66250-46-6";

		

		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de programacao";
		outroLivro.descricao = "Crie seus primeiros programas em java";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		
		
		
		Autor autor = new Autor();
		
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-10";
		
		livro.autor = autor;
		outroLivro.autor = autor;
		
		outroLivro.mostrarDetalhes();
		livro.mostrarDetalhes();
		

	}

}
