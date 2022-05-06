package estrutura_repeticao;

public class Ex30FOR {
	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 0;
		
		for(int i=0; i < 19; i++) {
			System.out.println(a);
			c = a;
			a = a + a + b;
			b = c;
		}
	}
}
