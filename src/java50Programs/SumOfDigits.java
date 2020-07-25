package java50Programs;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,m,n=0;
		m=675;
		while(m>0)
		{
			n=m%10;
			sum=(sum*10)+n;
			m=m/10;
		}
		System.out.println(sum);
	}

}
