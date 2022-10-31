package javaPOO;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int contador = 0;
		int nome = 0;
		String horario [] = new String [3];
		
		horario[0] = "13h";
		horario[1] = "16h";
		horario[2] = "18h";
		
		String films [] = new String [3];
		
		films[0] = "Whiplash";
		films[1] = "Madoka Magica Rebellion";
		films[2] = "Gojira";
		
		Scanner leitor = new Scanner(System.in);
		
		int soma = 0;
		int meia = 16;
		int inteira = 32;
		int total = 0;
		int sessao;
		
		while (contador != 4){
			System.out.println("Diga qual filme você deseja ver da seguinte lista: 1-  Whiplash 2- Madoka Magica Rebellion 3- Gojira");
			nome = leitor.nextInt();
			nome = nome - 1;
			
			System.out.println("Temos 3 sessões para "+ films[nome] +", diga qual prefere: 1- 13h, 2- 16h, 3- 18h");
			
			sessao = leitor.nextInt();
			sessao = sessao - 1;
			
			System.out.println("Quantas meia-entradas?");
			soma = leitor.nextInt();
			total = soma * meia;
			
			System.out.println("Quantas inteiras?");
			soma = leitor.nextInt();
			total += soma * inteira;
			
			System.out.println("Seu filme é: "+ films[nome] +". Horário: "+ horario[sessao]+ ". Custando um total de: " + total + ". Bom filme!");
			total = 0;
			
			System.out.println();
			
			System.out.println("Deseja comprar ingresso para outro filme? 0- Não 1- Sim");
			contador = leitor.nextInt();
			
			if (contador == 0) {
				break;
			
			}
		}
		
	}

}
