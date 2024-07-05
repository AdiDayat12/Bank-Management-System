public class Costumers extends Users{
    private String accountDetails;

    public Costumers (String email, String mobile, String address, String accountDetails){
        super(email, mobile, address);
        this.accountDetails = accountDetails;
    }
    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }
}
