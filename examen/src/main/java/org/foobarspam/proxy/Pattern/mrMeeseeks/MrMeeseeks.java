package org.foobarspam.proxy.Pattern.mrMeeseeks;
import java.util.concurrent.atomic.AtomicInteger;

//cambia el nombre de la clase
public class MrMeeseeks {	

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = "";
	private String messageOnDone = "";
	private String messageOnExplode = "";
			
	public MrMeeseeks(){
		this.setId(ID_GENERATOR.incrementAndGet());
	}

	public Integer getId() {
		return id;
	}

	public void sayMessageOnCreate(){
		
		System.out.println("OK: se han añadido: ");
		
	}
	
	public void sayMessageOnRequest(){
		
	}
	
	
	
	
	
	
	
	public String[] getMessageOnRequest() {
		return messageOnRequest;
	}

	public void setMessageOnRequest(String messageOnRequest) {
		this.messageOnRequest = messageOnRequest;
	}

	
	
	
	
	

	

	
	
}