package exercicioHeranca;

public class cavalo extends Ex01animal {
	
	@Override
	public void emitirSom() {
		System.out.println("Relincho!");
	}
	
	public void galopar() {
		System.out.println("Lá vai o miranda, cavalo o Almir!");
	}
}
