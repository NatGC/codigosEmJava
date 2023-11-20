package contasMatematicas;

import java.io.IOException;
import java.util.Scanner;

public class Callcenter {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Agradecemos sua ligação, com quem eu falo?");
		String nome = sc.next();
		
		outer:
			while (true) {
				
				
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("BEM VINDO(A) AO CRIANÇA ESPERANÇA "
				+ "\n Para doar R$ 2,00  aperte [1]"
				+ "\n Para doar R$ 5,00 aperte [2]"
				+ "\n Para doar R$ 15,00 aperte [3]"
				+ "\n Para fazer uma doação de outro valor aperte [4]"
				+ "\n-----------------------------------------------------------------------------");
					int opc = sc.nextInt();
				
					   while (true) {

				
		System.out.println("-------------------------------------------------------------------------");
				switch(opc){
				case 1: 
					System.out.println("Agradecemos pela doação de R$ 2,00. " + nome);
					break;
					
				case 2:
					System.out.println("Agradecemos pela doação R$ 5,00. "+ nome);
					break;
					
				case 3:
					System.out.println("Agradecemos pela doação R$ 15,00. "+ nome);
					break; 
					
				case 4:
					System.out.println("Digite o valor que quer doar: ");
					double doacao = sc.nextDouble();
					System.out.printf("Agradecemos pela doação de %.2f. %s%n", doacao, nome);
					break;
					
				default:
					System.out.println("Buuuu opção errada! Ouça melhor");
					break;
				}
				System.out.println("");
				
				System.out.println("Deseja voltar ao menu?[s/n]");
				int op = System.in.read();
				if (op == 's')
				break;
				if (op == 'n')
				break outer;
				
		System.out.println("-------------------------------------------------------------------------");
		sc.close();
		} 
			}
		
		
	}

}
