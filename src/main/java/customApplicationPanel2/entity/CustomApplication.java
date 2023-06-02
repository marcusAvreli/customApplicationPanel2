package customApplicationPanel2.entity;

public class CustomApplication {
	private String name;
	private String displayName;
	
	
	public CustomApplication() {
		
	}
	
	public CustomApplication(String name,String displayName) {
		this.name = name;
		this.displayName = displayName;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	 @Override
	   public String toString() {
	       return this.getDisplayName();
	   }
	
}
