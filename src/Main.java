import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		FonctionUtilitaire fonc = new FonctionUtilitaire();
		
		List<Integer> premFact = 
				Stream.iterate(1, n->n+1)
					.limit(10)
					.map(n->fonc.fact(n))
					.collect(Collectors.toList());
		System.out.println(premFact);
		//Pas IntStream car forEach ne prend que le type Stream

		System.out.println("\nQ1.c:");
		Stream.iterate(1, n->n+1)
		.limit(10)
		.map(n->fonc.fact(n))
		.forEach(System.out::println);
		
		System.out.println("\nQ1.d:");
		Stream.iterate(1, n->n+1)
		.map(n->fonc.fact(n))
		.filter(n -> String.valueOf(n).length()%2 == 0)
		.limit(4)
		.forEach(System.out::println);
		

		System.out.println("\nQ1.e:");
		Stream.iterate(new Pair(1, 1), pair->new Pair(pair.val+1, pair.f * (pair.val+1)))
		.map(pair->pair.f)
		.limit(10)
		.forEach(System.out::println);
	}
	
}
