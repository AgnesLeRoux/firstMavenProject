package fr.ibformation;

public class Calculator {
	
	private int AffixeA;
	private int AffixeB;
	
	public Calculator(NumberProvider provider) {
		this.AffixeA = provider.getA();
		this.AffixeB = provider.getB();
	}
	
	public  int calculer(int a, int b)
	{
		a+= this.AffixeA;
		b+= this.AffixeB;
		
		int res = a+b;
		if(a==0)
		{
			res=b*2;
		}
		if(b==0)
		{
			res=a*a;
		}
		return res;
	}

	
	
}
