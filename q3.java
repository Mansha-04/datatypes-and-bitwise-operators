package datatypesbitwiseop;

public class q3 {
	public static long swap(long x,int i,int j) {
		if(((x>>i)&1)!=((x>>j)&1)) {
			long bitMask=(1L<<i|1L<<j);
			x^=bitMask;
		}
		return x;
	}
	public static void main(String[] args) {
		long x=28;
		System.out.println(swap(x,4,0));
	}

}
