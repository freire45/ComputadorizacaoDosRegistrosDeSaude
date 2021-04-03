package br.com.erickfreire.computadorizacaodosregistrosdesaude;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComputadorizacaoDosRegistrosDeSaudeTeste {
	
	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		String sexo;
		int dia;
		int mes;
		int ano;
		int idade;
		double altura;
		double peso;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Controle de Saúde: ");
		System.out.print("Digite o seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		sobrenome = entrada.nextLine();
		System.out.print("Informe o seu sexo: ");
		sexo = entrada.nextLine();
		System.out.print("Informe o dia de nascimento: ");
		dia = entrada.nextInt();
		System.out.print("Informe o mes de nascimento: ");
		mes = entrada.nextInt();
		System.out.print("Informe o ano de nascimento: ");
		ano = entrada.nextInt();
		System.out.print("Digite a sua altura: ");
		altura = entrada.nextDouble();
		System.out.print("Digite o seu peso: ");
		peso = entrada.nextDouble();
		
		ComputadorizacaoDosRegistrosDeSaude c1 = new ComputadorizacaoDosRegistrosDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
		
		
		System.out.println("\n\n*************************************\n");
		
		System.out.printf("Ficha Médica%n%nNome: %s %s%n"
				        + "Data Nascimento %d/%d/%d%n"
				        + "Sexo: %s%n"
				        + "Altura: %.2f%n"
				        + "Peso: %.2f%n"
				        + "Idade: %d anos%n"
				        + "IMC: %.2f%n"
				        + "Status do peso: %s%n"
				        + "Frequencia Cardiaca Máxima: %d%n"
				        + "Frequência Cardiaca Alvo: %s%n", nome, sobrenome, dia, mes, ano, sexo, altura, peso, c1.calculaIdade(ano),
				        c1.calculaIMC(peso, altura), c1.verificaIMC(c1.calculaIMC(peso, altura)),c1.calculaFrequenciaMaxima(c1.calculaIdade(ano)),
				        c1.calculaFrequenciaAlvo(c1.calculaFrequenciaMaxima(c1.calculaIdade(ano))));
		
		
		
	}
	
}
