
public class Place {

	private int id; //System generated
	private String Name; 
	private String  Description;
	private String  Address;
	private int Parish_code; 
	private float Entry_cost; 
	private int Opening_hours;
	private String Contact_number;
	private String Photo;
	private String Attration;
	
	//Default Constructor 
	public Place() {
		id = 0;
		Name=""; 
		Description="";
		Address="";
		Parish_code  = 0; 
		Entry_cost=0; 
		Opening_hours =0;
		Contact_number ="";
		Photo  = "";
		Attration="";
		
	}
	
	//Primary Constructor
	public Place(int i, String name, String description, String address, int parish_code, float entry_cost, int opening_hours, String contact_number, String photo, String attraction) {
		id = i;
		Name= name; 
		Description= description;
		Address= address;
		Parish_code  = parish_code; 
		Entry_cost = entry_cost; 
		Opening_hours = opening_hours;
		Contact_number = contact_number;
		Photo  =  photo;
		Attration= attraction;
		
	}
	
	//Copy Constructor
	public Place(Place PlaceObj) {
		id = PlaceObj.id;
		Name= PlaceObj.Name; 
		Description= PlaceObj.Description;
		Address= PlaceObj.Address;
		Parish_code  = PlaceObj.Parish_code; 
		Entry_cost= PlaceObj.Entry_cost; 
		Opening_hours = PlaceObj.Opening_hours;
		Contact_number = PlaceObj.Contact_number;
		Photo  = PlaceObj.Photo;
		Attration = PlaceObj.Attration;
		
	}
	
	//Methods
	
	public void AddPlace() {
		
	}
	
	public void ViewPlace() {
		//As a Jamaica Tourist Board Administrator, I should be able to view all places in the system.
	}
	
	
	
	
	//Setters and Getters 
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public int getParish_code() {
		return Parish_code;
	}
	public void setParish_code(int parish_code) {
		this.Parish_code = parish_code;
	}
	public float getEntry_cost() {
		return Entry_cost;
	}
	public void setEntry_cost(float entry_cost) {
		this.Entry_cost = entry_cost;
	}
	public int getOpening_hours() {
		return Opening_hours;
	}
	public void setOpening_hours(int opening_hours) {
		this.Opening_hours = opening_hours;
	}
	public String getContact_number() {
		return Contact_number;
	}
	public void setContact_number(String contact_number) {
		this.Contact_number = contact_number;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		this.Photo = photo;
	}
	public String getAttration() {
		return Attration;
	}
	public void setAttration(String attration) {
		this.Attration = attration;
	}

	public void display(){
		System.out.println("ID: " + getId() + " " + "Name: " + getName() + " " + "Description: " + getDescription() 
			+ " " + "Parish Code: " + getParish_code() + " " + "Entry Cost: " + getEntry_cost() + " " 
			+ "Opening Hrs: " + getOpening_hours() + " " + "Contract#: " + getContact_number() + " " 
			+"Photo: " + getPhoto() + " " + "Attration: " + getAttration() + "\n");
	}

}
