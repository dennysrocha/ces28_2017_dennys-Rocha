package CreationalPatterns;

public class Data {
	private Date date_;
	private Person sender_;
	private Person receiver_;
	private String subject_;
	
	public Date getDate() {
		return date_;
	}
	
	public Person getSender() {
		return sender_;
	}
	
	public Person getReceiver() {
		return receiver_;
	}
	
	public String getSubjectMatter() {
		return subject_;
	}
}