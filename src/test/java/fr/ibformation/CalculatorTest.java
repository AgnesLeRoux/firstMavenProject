package fr.ibformation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import  org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest   {
	
	//Calculator calc;
	@Spy
	NumberProvider np;
	
	@Before
	public void setUp() throws Exception {
		//calc = new Calculator();
		//np = Mockito.mock(NumberProvider.class); //est remplacé par l'annotation @Mock de np
		Mockito.when(np.getA()).thenReturn(0);
		Mockito.when(np.getB()).thenReturn(0);
	}
	
	@Test
	public void testCalculer() throws Exception
	{
		Calculator calc = new Calculator(np);
		int a=4;
		int b=5;
		int result = 9;
		Assert.assertEquals(result,calc.calculer(a,b));
	}
	
	@Test
	public void testCalculer1() throws Exception
	{
		Calculator calc = new Calculator(np);
		Assert.assertEquals(0, calc.calculer(0, 0));
		
	}
	
	@Test
	public void testCalculer2() throws Exception
	{
		Calculator calc = new Calculator(np);
		Assert.assertEquals(6, calc.calculer(0, 3));
	
	}
	
	@Test
	public void testCalculer3() throws Exception
	{
		Calculator calc = new Calculator(np);
		Assert.assertEquals(9,calc.calculer(3, 0));
	}
	
	@After
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
	}

}
