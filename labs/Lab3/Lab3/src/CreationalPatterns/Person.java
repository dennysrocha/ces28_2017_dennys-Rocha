package CreationalPatterns;

public class Person {
	private String name_;
	private String address_;
	private BigAddress bigAddress_;
	private String phone_;
	private String email_;
	private String pronoun_;
	
	public String getName() {
		return name_;
	}
	
	public String getAddress() {
		return address_;
	}
	
	public String getBigAddress() {
		return bigAddress_.getAddress();
	}
	
	public void setBigAddress(BigAddress bigAddress_) {
		this.bigAddress_ = bigAddress_;
	}
	
	public String getPhone() {
		return phone_;
	}
	
	public String getEmail() {
		return email_;
	}
	
	public String getPronoun() {
		return pronoun_;
	}
}