package datatypesbitwiseop;
public class q2 {
	public static short parity(long x) {
		short result=0;
		while(x!=0) {
			result^=(x&1);
			x>>>=1;
		}
		return result;
	}
	public static void main(String[] args) {
		long a=35L;
		System.out.println(parity(a));
	}

}
