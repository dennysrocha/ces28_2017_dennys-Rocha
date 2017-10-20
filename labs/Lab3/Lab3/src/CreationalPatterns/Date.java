package CreationalPatterns;

public class Date {
	private String date_;
	private String[] splitDate_;
	
	public String[] splitDate() {
		if (date_.contains("/") || date_.contains("-")) {
			splitDate_ = date_.split("/");
		}
		return splitDate_;
	}
	
	public String getDay() {
		return splitDate_[1];
	}
	
	public String getMonth() {
		return splitDate_[0];
	}
	
	public String getYear() {
		return splitDate_[2];
	}
}
