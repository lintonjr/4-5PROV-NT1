import java.util.Scanner;

public class Cliente {
	CarrosFactory fabricaCarro;
	
	Cliente(CarrosFactory fabricaCarro) {
		this.fabricaCarro = fabricaCarro;
	}
	
	public void criaCarro(String tipo) {
		Carro carro;
		carro = fabricaCarro.criarCarro(tipo);
	}
	
	public static void main(String[] args) {
		String tipo;
		Scanner in = new Scanner(System.in);
		tipo = in.next();
		
		CarrosFactory fabricaCarro = new CarrosFactory();
		Cliente carro = new Cliente(fabricaCarro);
		carro.criaCarro(tipo);
	}
	
}
