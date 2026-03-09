import java.util.stream.IntStream;

public class FonctionUtilitaire {
	public int fact(int n) {
		return IntStream.range(1,n+1)
						.reduce(1, (x, y) -> x*y);
	}
}
