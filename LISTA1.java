import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Selecione a questão que deseja testar de 1 a 5(0 encerra o programa): ");
		
		int questao = 1;
		
		while(questao != 0 ) {
			
			questao = ler.nextInt();
			
			if(questao==1) {
		
		//QUESTÃO1
		
		System.out.println("Dados da Primeira pessoa: ");
		
		String Nome1 = ler.next();
		
		int idade1 = ler.nextInt();
		
		System.out.println("Dados da Segunda pessoa: ");
		
		
		String Nome2 = ler.next();
		
		int idade2 = ler.nextInt();
		
		if(idade1>idade2) {
			System.out.println("Pessoa mais velha: " + Nome1);
		}else if(idade1<idade2){
			System.out.println("Pessoa mais velha: " + Nome2);
		}else {
			System.out.println("Mesma idade!");
		}
		questao = ler.nextInt();
			}
			
			if(questao==2) {
		
		//QUESTÃO2
		
		System.out.println("Dados do Primeiro funcionario: ");
		
		String Nomefunc1 = ler.next();
		
		double salario1 = ler.nextDouble();
		
		System.out.println("Dados do Segundo funcionario: ");
		
		String Nomefunc2 = ler.next();
		
		double salario2 = ler.nextDouble();
		
		double salarioMedio =  (salario1 + salario2) / 2;
		
		System.out.println("Salário médio = " + salarioMedio);
		questao = ler.nextInt();
			}
			
			if(questao==3) {
		//QUESTÃO3
		
		System.out.println("Entre a largura e altura do retângulo: ");

		double altura = ler.nextDouble();
		
		double largura = ler.nextDouble();
		
		double diagonal =  Math.sqrt(altura*altura + largura*largura);
		
		double area = altura*largura;
		
		double perimetro = altura + largura;
		
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
		System.out.println("Diagonal = " + diagonal);
		questao = ler.nextInt();
			}
			if(questao==4) {
		
		//QUESTÃO4
		
		System.out.println("Nome:\nSalário bruto:\nImposto:\n ");
		
		String NomeFuncImposto= ler.next();
		
		double salarioBruto = ler.nextDouble();
		
		double imposto = ler.nextDouble();
		
		double salarioLiquido = salarioBruto - imposto;

		System.out.println("Funcionario: " + NomeFuncImposto + "," + salarioLiquido);
		System.out.println("Digite a porcentagem para aumentar o salário: ");
		
		double porcentagem = ler.nextDouble();
		
		double salarioLiquidoAtt = ((salarioBruto/100)*porcentagem)+salarioLiquido;
		
		System.out.println("Dados atualizados: " + NomeFuncImposto + "," + salarioLiquidoAtt);
		questao = ler.nextInt();
			}
			if(questao==5) {
		//QUESTÃO5
		
		System.out.println("Nome do Aluno: ");
		String NomeAluno = ler.next();
		System.out.println("Digite as 3 notas do aluno: ");
		double nota1 = ler.nextDouble();
		double nota2 = ler.nextDouble();
		double nota3 = ler.nextDouble();
		
		double notafinal = nota1 + nota2 + nota3;
		
		System.out.println("Nota final = " + notafinal);
		
		if(notafinal >= 60) {
			System.out.println("APROVADO");
		}else {
			double precisa = 60 - notafinal;
			System.out.println("REPROVADO");
			System.out.println("Faltaram "+ precisa + "pontos.");
		}
			}
			if(questao>5||questao<0) {
				System.out.println("Numero inválido");
				questao = ler.nextInt();
			}
		}
		
	}

}
