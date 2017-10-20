package CreationalPatterns;

public class BigAddress {
	private String street_;
	private String complement_;
	private String number_;
	private String zip_;
	private String address_;
	
	public BigAddress(String street_, String number_) {
		this.street_ = street_;
		this.number_ = number_;
		this.address_ = street_ + ", numero " + number_;
	}
	
	public BigAddress(String street_, String number_, String zip_) {
		this.street_ = street_;
		this.number_ = number_;
		this.zip_ = zip_;
		this.address_ = street_ + ", numero " + number_ + ", CEP " + zip_;
	}
	
	public BigAddress(String street_, String complement_, String number_, String zip_) {
		this.street_ = street_;
		this.complement_ = complement_;
		this.number_ = number_;
		this.zip_ = zip_;
		this.address_ = street_ + ", " + complement_ + ", numero " + number_ + ", CEP " + zip_;
	}
	
	public String getAddress() {
		return this.address_;
	}
	
	public String getStreet() {
		return this.street_;
	}
	
	public void setStreet(String street_) {
		this.street_ = street_;
	}
	
	public String getComplement() {
		return this.complement_;
	}
	
	public void setComplement(String complement_) {
		this.complement_ = complement_;
	}
	
	public String getNumber() {
		return this.number_;
	}
	
	public void setNumber(String number_) {
		this.number_ = number_;
	}
	
	public String getZip() {
		return this.zip_;
	}
	
	public void setZip(String zip_) {
		this.zip_ = zip_;
	}
	
	
}
