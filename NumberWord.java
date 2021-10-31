import java.util.Scanner;

public class NumberWord
{
	static String one[] = {"","one","two","three","four","five","six","seven","eight","nine","ten",
							"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String two[] = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	static void pw(int n,String st)
	{
		if (n<=19)
			System.out.print(one[n]+" ");
		else
			System.out.print(two[n/10]+one[n%10]+" ");
		if (n!=0)
			System.out.print(st+" ");
	}
	public static void main(String[] args)
	{
		System.out.print("\nEnter the number");
		
		Scanner sc = new Scanner(System.in);
		
		double value = sc.nextDouble();
		
		int num = (int)value;
		
		double decimal = (10*value-10*num)/10;
		
		String s1=String.valueOf(decimal);
		
		String test="";
		
		char ch[]=s1.toCharArray();
		
		String count="1";
		
		for (int i=2;i<ch.length ;i++)
		{
			test=test+ch[i];
			count=count+"0";
		}
		
		pw(num/10000000,"Crores");
		
		pw((num/100000)%100, "Lakhs");
		
		pw((num/1000)%100, "Thousand");
		
		pw((num/100)%10, "Hundred");
		
		pw(num % 100,test +"only");
	}
}