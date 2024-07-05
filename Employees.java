public class Employees extends Users{
    private String jobTitle;
    private String department;

    public Employees (String email, String mobile, String address, String jobTitle, String department){
        super(email, mobile, address);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
