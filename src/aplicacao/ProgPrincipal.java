package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. Armazene os N produtos em um vetor. Em
		seguida, mostrar o preço médio dos produtos.
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de Produtos: ");
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];// criando o vetor tipo classe
		
		//Inserindo os dados no vetor tipo classe
		for (int i=0; i<vect.length;i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Valor do produto: ");
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome,preco);
		}
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Média de preço R$: %.2f%n", media);
		
		sc.close();
		
	}

}
