import java.util.UUID;

public abstract class Users {
    private final String ID;
    private String email;
    private String mobile;
    private String address;

    protected Users (String email, String mobile, String address){
        this.ID = String.valueOf(UUID.randomUUID());
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }
    public String getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void login ();
    public abstract void logout ();
    public String getUserDetails (Users user){
        return "ID : " + user.ID+ " email : " + user.email + " mobile : " + user.mobile + " address : " + user.address;
    }
}
