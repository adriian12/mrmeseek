package org.foobarspam.proxy.Pattern.mrMeeseeks;
import java.util.concurrent.atomic.AtomicInteger;

//cambia el nombre de la clase
public class MrMeeseeks {	

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
			
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
}