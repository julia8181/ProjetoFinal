package controlenivel;
	import java.util.*;
	public class ControleNivel {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			ArrayList <Reservatorio> caixas = new ArrayList<>();
			
			int maxCaixas = 5;
			int opcao;
			
			System.out.println("-------- Contole de Reservatórios --------");
			do {
				System.out.println("1 - Cadastrar caixa d'água");
				System.out.println("2 - Verificar situação");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();
				entrada.nextLine();
				
				switch(opcao) {
				case 1:
					if(caixas.size() >= maxCaixas) {
						System.out.println("Limite de cadastro atingido.");
					} 
					else {
				System.out.println("Número da caixa: ");
				String nome = entrada.nextLine();
				
				System.out.println("Quantidade de litros: ");
				int litros = entrada.nextInt();
				
				Reservatorio novaCaixa = new Reservatorio (nome, litros);
				caixas.add(novaCaixa);
				System.out.println("Caixa cadastrada!");
					}
				break;
				
				case 2:
					System.out.println("--- Informações ----");
					for(int i = 0; i < caixas.size(); i++) {
						System.out.println("----------------------");
						caixas.get(i).mostrarInfo();
						caixas.get(i).verificarSituacao();
					}
					break;
				case 0:
					System.out.println("Programa encerrado");
					break;
					
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
				
			} while(opcao !=0);			
		}			
	}		