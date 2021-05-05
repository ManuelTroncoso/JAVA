package calculadora;

public class Calculadora {

	private int ans;

	public Calculadora() {
		ans = 0;
	}

	public static void main(String arg[]) {
		int a = 3, b = 2;
		int res = Suma(a, b);

		System.out.println("3 + 2 = " + res);
	}

	public static int Suma(int a, int b) {
		return a + b;
	}

	public static int Resta(int a, int b) {
		return a - +b;
	}

	public int Add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int Sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	public int Add(int v) {
		ans += v;
		return ans;
	}

	public int Sub(int v) {
		ans -= v;
		return ans;
	}

	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No puedes dividir por cero!!!");
		}
		ans = a / b;
		return ans;
	}
	
	public void OperacionOptima() 
	{
		//para simular el tiempo de espera
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//para evitar bucles infinitos
//		while(true) 
//		{
//			
//		}
	}
}
