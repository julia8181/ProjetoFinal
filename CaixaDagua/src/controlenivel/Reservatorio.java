package controlenivel;

public class Reservatorio {
	String nome;
	int litros;
	
	public Reservatorio(String nome, int litros) {
		this.nome = nome;
		this.litros = litros;
	}
	
	public void verificarSituacao() {
		if(litros > 36000) {
			System.out.println("Limite excedido!");
		}
		
		else if(litros == 36000) {
			System.out.println("Limite máximo suportado atingido.");
		}
			else if(litros > 15000) {
				System.out.println("Tudo nos conformes.");
			}
	
			else if (litros > 10000){
				System.out.println("ALERTA: Limite próximo.");
			}
		else {
			System.out.println("Limite mínimo atingido.");
		}
		
	}
	public void mostrarInfo() {
		System.out.println("Caixa: " + nome);
		System.out.println("Litros: " + litros);
	}

}

