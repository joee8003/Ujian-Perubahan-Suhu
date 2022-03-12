package com.juaracoding.perubahansuhu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestPerubahanSuhu {
	
	PerubahanSuhu perubahanSuhu;
	
	@Before
	public void setUp() throws Exception {
		perubahanSuhu = new PerubahanSuhu();
		
	}
	@Test
	@FileParameters("src/test/resources/PerubahanSuhu")
	
	public void testPerubahanSuhu(double f, double expect) {
	
	double actual = perubahanSuhu.testperubahanSuhu(f, expect);
	
	assertEquals(expect, actual, 0.0);
	
	}
	@Test
	public void testVolumeKolamRenangBukanAngka() {
		
		String fBukanAngka = "D";
		
		double convert = Double.parseDouble(fBukanAngka);
		
		double actual = perubahanSuhu.testperubahanSuhu(0,convert);		
		
		String expect = "D";
		
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
	}
	
	@Test
	public void TestPerubahanSuhuAngkaNegatif() {
	
	double f = -5;
	
	double actual = perubahanSuhu.testperubahanSuhu(f);
	
	assertEquals(5, actual, 0.0);
	
	}
	
	@Test
	public void testPerubahanSuhuNull() {
	
	double f = 0;
	
	Double fNull = null;
	
	double actual = perubahanSuhu.testperubahanSuhu(f);
	assertNull(fNull);
	assertEquals(0, actual, 0.0);
	
	}
}
