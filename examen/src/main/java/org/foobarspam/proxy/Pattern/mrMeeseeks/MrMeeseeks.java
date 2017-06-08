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
	
	private void setId(int increment) {
		
	}

	public MrMeeseeks(Integer id, String[] messageOnRequest, String messageOnDone, String messageOnExplode) {
		super();
		this.id = id;
		this.messageOnRequest = messageOnRequest;
		this.messageOnDone = messageOnDone;
		this.messageOnExplode = messageOnExplode;
	}

	public Integer getId() {
		return id;
	}

	public void sayMessageOnCreate(){
		
		System.out.println("I'm Mr.Meeseeks look at mee!!" + id);
		
	}
	
	public void sayMessageOnRequest(){
		
		System.out.println("Oooh yeah!, Yes, ma'am!");
		
	}
	
	public void sayMessageOnDone(){
			
			System.out.println("All done!");
			
		}
	
	public void sayMessageOnExplode(){
		
		System.out.println("Oooh yeah!, Yes, ma'am!");
		
	}
	
	//Generamos el la mensaje que respone MrMeeseeks automáticamente
	public String generateMessageOnRequest(String messageOnRequest){
		
		System.out.println(this.generateMessageOnRequest(messageOnRequest));
		if(this.id()){
		
		for(int i = 0; i < this.getMessageOnRequest().length; i++){
			
			getMessageOnRequest().get(i).generateMessageOnRequest();
		}
		}else{
		
		for(listMrMeeseeks MrMeeseeks : getMessageOnRequest()){
			
			System.out.println( "" + MrMeeseeks.getId());
		}
		}
		
	}

	public String[] getMessageOnRequest() {
		return getMessageOnRequest();
	}

	public void setMessageOnRequest(String[] messageOnRequest) {
		this.messageOnRequest = messageOnRequest;
	}



	
	
	
	
	

	

	
	
}