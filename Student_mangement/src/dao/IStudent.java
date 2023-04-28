package dao;

public class IStudent {
	private String name;
	private String entry;
	private String email;
	private String home;
	private int contact;
	
	public IStudent (String name,String entry,String email,String home,int contact) {
		this.name=name;
		this.entry=entry;
		this.email=email;
		this.home=home;
		this.contact=contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	
}
