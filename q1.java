package datatypesbitwiseop;

public class q1 {
	public static short countBits(int x) {
		short numBits=0;
		while(x!=0) {
			numBits+=(x&1);
			x>>>=1;
		}
		return numBits;
	}
	public static void main(String[] args) {
		int a=10;
		System.out.println(countBits(a));
	}

}
