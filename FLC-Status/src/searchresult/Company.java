package searchresult;

public class Company {
	private String employerName; 
    private String jobTitle;
    private String location;
    private String  baseSal;
    private String  status;
    
    public String getemployerName() {
		return employerName;
	}
    
	public void setemployerName(String employerName) {
		this.employerName = employerName;
	}
	
	public String getjobTitle() {
		return jobTitle;
	}
    
	public void setjobTitle(String job_title) {
		this.jobTitle= job_title;
	}
	
	public String getLocation() {
		return location;
	}
    
	public void setLocation(String loc) {
		this.location = loc;
	}
	
	public String getbaseSal() {
		return baseSal;
	}
    
	public void setbaseSal(String bases) {
		this.baseSal = bases;
	}
	
	public String getStatus() {
		return status;
	}
    
	public void setStatus(String status) {
		this.status= status;
	}
}
