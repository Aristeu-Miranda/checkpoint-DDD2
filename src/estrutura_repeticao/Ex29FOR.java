package estrutura_repeticao;

public class Ex29FOR {

	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 0;
		
		for(int i=0; i < 29; i++) {
			System.out.println(a);
			c = a;
			a = a + b;
			b = c;
		}
	}

}
