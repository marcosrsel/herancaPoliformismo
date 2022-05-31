package exercicioHeranca;

public class zoologico {
public static void main(String[] args) {
		
		cachorro cachorro = new cachorro();
		cavalo cavalo = new cavalo();
		preguica preguica = new preguica();
		
		System.out.println("Olhem que lindos os bichinhos no Zoo \n");
		
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println();
		
		cavalo.galopar();
		cavalo.emitirSom();
		
		System.out.println();
		
		preguica.subirEmArvore();
		preguica.emitirSom();
		
		System.out.println("\nEspero que tenham gostado da apresentação e voltem em breve!");
	}

}
