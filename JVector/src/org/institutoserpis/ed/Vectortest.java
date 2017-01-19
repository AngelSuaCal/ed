package org.institutoserpis.ed;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Vectortest{
	
	
	public void IndexOf(){
		assertEquals(0, Vector.indexOf(new int[]{13,64,14,54,74},13));
	}
	
	
	public void indexOfEmpty(){
		assertEquals(-1, Vector.indexOf(new int[]{},13));
	}
	
	@test
	public void selectionSort() {
		int[] v = new int[]{32, 15, 7, 9, 12};
		Vector.selectionSort(v);
		assertArrayEquals();
	}
}
