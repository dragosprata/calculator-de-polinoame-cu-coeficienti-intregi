package test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import polinom.Operatii;

import static org.junit.Assert.*;
public class OperatiiTest {
	
public OperatiiTest(){
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

//testarea adunarii
@Test
public void testAdunare(){
	Operatii o = new Operatii();
	o.adaugaP(2, 3);
	o.adaugaQ(5, 3);
	o.adunare();
	String rezAsteptat = "7X^3";
	assertEquals(o.getR(),rezAsteptat);
}

//testarea scaderii
@Test
public void testScadere(){
Operatii o = new Operatii();
o.adaugaP(3,4);
o.adaugaQ(1,4);
o.scadere();
o.getR();
String rez = "2X^4";
assertEquals(o.getR(),rez);
}

//testarea derivarii
@Test
public void testDerivare(){
	Operatii o =new Operatii();
	o.adaugaP(1, 2);
	o.adaugaP(3, 1);
	o.adaugaP(5, 0);
	o.derivare();
	o.getR();
	String rez = "2X+3";
	assertEquals(o.getR(),rez);
}

//testarea inmultirii
@Test
public void testInmultire(){
	Operatii o = new Operatii();
	o.adaugaP(2, 3);
	o.adaugaP(5, 2);
	o.adaugaQ(2, 2);
	o.inmultire();
	o.getR();
	String rez = "4X^5+10X^4";
	assertEquals(o.getR(),rez);
}

}
