package add;

public class Snippet {
	public static int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		System.out.println("a = " + Integer.toBinaryString(a) + " b = "+ Integer.toBinaryString(b));
		while (b != 0) {
			int carry = a & b;
			System.out.println("carry = " + Integer.toBinaryString(carry)); 
			a = a ^ b;
			b = carry << 1;
			System.out.println("a = " + Integer.toBinaryString(a) + " b = "+ Integer.toBinaryString(b));
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(getSum(27,26)));
	}
}

