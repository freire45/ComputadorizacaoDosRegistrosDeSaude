package br.com.erickfreire.computadorizacaodosregistrosdesaude;

public class ComputadorizacaoDosRegistrosDeSaude {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private double altura;
	private double peso;
	
	public ComputadorizacaoDosRegistrosDeSaude(String n, String sb, String sx, int d, int m, int a, double alt, double ps) {
		this.nome = n;
		this.sobrenome = sb;
		this.sexo = sx;
		this.dia = d;
		this.mes = m;
		this.ano = a;
		this.altura = alt;
		this.peso = ps;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int calculaIdade(int a) {
		return 2021 - a;
	}
	
	public int calculaFrequenciaMaxima(int idade) {
		return 220 - idade;
	}
	
	public String calculaFrequenciaAlvo(int freqMa) {
		double minimo = freqMa * 0.5;
		double maxima = freqMa * 0.8;
		
		return String.format("%.2f - %.2f", minimo, maxima);
	}
	
	public double calculaIMC(double p, double a) {
		double imc =  (p / Math.pow(a, 2));
		return imc;
	}
	
	public String verificaIMC(double imc) {
		String msg = "";
		
		if(imc < 18.5)
			msg = "Abaixo do peso";
		if(imc >= 18.5)
			if(imc < 25)
				msg = "Peso Normal";
		if(imc > 24.9)
			if(imc < 30)
				msg = "Sobrepeso";
		if(imc > 29.9)
			msg = "Obesidade";
		
		return msg;
	 }


}
