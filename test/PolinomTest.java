package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import polinom.Polinom;

import static org.junit.Assert.*;

public class PolinomTest {
public PolinomTest(){
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

//testarea metodei adaugaMonom din clasa Polinom
@Test
public void testAdaugaMonom(){
	Polinom p = new Polinom();
	p.adaugaMonom(1,2);
	p.adaugaMonom(5,3);
	p.adaugaMonom(6,3);
	double expResult = 11;
	double rezultat = p.getCoeficient(3);
	assertEquals(expResult,rezultat,0.1);
}

//testatrea metodei getCoeficient din clasa Polinom
@Test
public void testGetCoeficient(){
	int grad = 0;
	double expResult = 1.7;
	Polinom instance = new Polinom();
	instance.adaugaMonom(expResult,grad);
	double rezultat = instance.getCoeficient(grad);
	assertEquals(expResult,rezultat,0.0);
}
}
