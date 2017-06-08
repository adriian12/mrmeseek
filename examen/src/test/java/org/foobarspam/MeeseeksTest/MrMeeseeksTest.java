package org.foobarspam.MeeseeksTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import org.junit.Test;


import junit.framework.TestCase;

public class MrMeeseeksTest extends TestCase {
	
	@Test
	public void test() {
		MrMeeseeks mrMeeseeksUno = new MrMeeseeks();
		
		MrMeeseeks.setId(1001);
		MrMeeseeks.setMrMeeseeks("Bernat");
		MrMeeseeks.añadir(MrMeeseeks);
		
		assertThat(MrMeeseeks.MrMeeseeks())length();
		assertThat(MrMeeseeks.getId()).hasSize(1);
	}
	
	@Test
	public void test1() {
		MrMeeseeks MrMeeseeksUno = new MrMeeseeks("Daddy");
		int id = 1001;
		assertThat(id.getId()).isEqualTo("1001");
		assertThat(MrMeeseeksUno).isNotNull();	
	}
}
