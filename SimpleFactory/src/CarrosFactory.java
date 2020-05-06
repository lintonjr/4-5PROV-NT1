
public class CarrosFactory {
	public Carro criarCarro(String tipo) {
		Carro carro = null;
		switch(tipo) {
			case "SUV":
				carro = new CRV();
				break;
			case "HATCH":
				carro = new FIT();
				break;
			case "SEDAN":
				carro = new CIVIC();
				break;
		}
		return carro;
	}
}
