import java.util.stream.Stream;

public class Somme {
	public int somme (Stream<Produit> serie) {
		return serie.reduce(0, (x,y)-> x+y.getPrix());
				
	}
}
