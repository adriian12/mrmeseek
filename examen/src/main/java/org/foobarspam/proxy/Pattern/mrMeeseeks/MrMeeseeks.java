package org.foobarspam.proxy.Pattern.mrMeeseeks;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//cambia el nombre de la clase
public class MrMeeseeks {	

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = Messages.getString("MrMeeseeks.0"); //$NON-NLS-1$
	private String messageOnDone = Messages.getString("MrMeeseeks.1"); //$NON-NLS-1$
	private String messageOnExplode = Messages.getString("MrMeeseeks.2"); //$NON-NLS-1$
			
	public MrMeeseeks(){
		this.setId(ID_GENERATOR.incrementAndGet());
	}
	
	public MrMeeseeks(String string) {
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
		
		System.out.println(Messages.getString("MrMeeseeks.3") + id); //$NON-NLS-1$
		
	}
	
	public void sayMessageOnRequest(){
		
		System.out.println(Messages.getString("MrMeeseeks.4")); //$NON-NLS-1$
		
	}
	
	public void sayMessageOnDone(){
			
			System.out.println(Messages.getString("MrMeeseeks.5")); //$NON-NLS-1$
			
		}
	
	public void sayMessageOnExplode(){
		
		System.out.println(Messages.getString("MrMeeseeks.6")); //$NON-NLS-1$
		
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
			
			System.out.println( Messages.getString("MrMeeseeks.7") + MrMeeseeks.getId()); //$NON-NLS-1$
			}
		}
		
	}

	public String[] getMessageOnRequest() {
		return getMessageOnRequest();
	}

	public void setMessageOnRequest(String[] messageOnRequest) {
		this.messageOnRequest = messageOnRequest;
	}

	public String formulateRequest(String messageOnDone, String messageOnExplode){
		
		return Messages.getString("MrMeeseeks.8") + Arrays.toString(getMessageOnRequest()) + Messages.getString("MrMeeseeks.9") //$NON-NLS-1$ //$NON-NLS-2$
				+ getClass() + Messages.getString("MrMeeseeks.10") + super.toString() + Messages.getString("MrMeeseeks.11"); //$NON-NLS-1$ //$NON-NLS-2$
		
	}
		
	public String doRequest(String messageOnDone, String messageOnExplode){
		
	}
	
	public void stopExisting(){
		return MrMeeseeks.ID_GENERATOR.delete; /*Para borrar el MrMeeseek creado */	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((messageOnDone == null) ? 0 : messageOnDone.hashCode());
		result = prime * result + ((messageOnExplode == null) ? 0 : messageOnExplode.hashCode());
		result = prime * result + Arrays.hashCode(messageOnRequest);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MrMeeseeks other = (MrMeeseeks) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (messageOnDone == null) {
			if (other.messageOnDone != null)
				return false;
		} else if (!messageOnDone.equals(other.messageOnDone))
			return false;
		if (messageOnExplode == null) {
			if (other.messageOnExplode != null)
				return false;
		} else if (!messageOnExplode.equals(other.messageOnExplode))
			return false;
		if (!Arrays.equals(messageOnRequest, other.messageOnRequest))
			return false;
		return true;
	}
	
	
	
	
	

	

	
	
}