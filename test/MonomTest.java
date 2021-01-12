package test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import polinom.Monom;

import static org.junit.Assert.*;
public class MonomTest {

	public MonomTest(){
	}
	
	@BeforeClass
	public static void setUpClass(){
	}
	
	@AfterClass
	public static void tearDownClass(){
	}
	
	@Before
	public void setUp(){
	}
	
	@After
	public void tearDown(){
	}
	
	//testarea metodei setCoeficientInmultire din clasa Monom
	@Test
	public void testSetCoeficientInmultire(){
		System.out.println("setCoeficientInmultire");
		double x = 3.0;
		Monom instance = new Monom(x,5);
		instance.setCoeficientInmultire(2);
		assertEquals(instance.getCoeficient(),x*2,0.0001);
	}
	
	//testarea metodei decGrad din clasa Monom
	@Test
	public void testDecGrad(){
		System.out.println("decGrad");
		int grad = 11;
		Monom instance = new Monom(10,grad);
		instance.decGrad();
		int expRes = --grad;
		assertEquals(grad,expRes);
	}
	
	//testarea metodei incGrad din clasa Monom
    @Test
    public void testIncGrad(){
    	System.out.println("incGrad");
    	int grad = 5;
    	Monom instance = new Monom(10,grad);
    	instance.incGrad();
    	int expRes = ++grad;
    	assertEquals(grad,expRes);
    }
}
