package Phonebook;

public class Entry {
	
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String teleNum;
	
	
	Entry() {}
	
	Entry(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String teleNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.teleNum = teleNum;
	}
	
	
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	
	public String getStreetAddress(){
		return this.streetAddress;
	}
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	
	
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}
	
	public String getZipCode(){
		return this.zipCode;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public String getTeleNum(){
		return this.teleNum;
	}
	public void setTeleNum(String teleNum){
		this.teleNum = teleNum;
	}
	

}
