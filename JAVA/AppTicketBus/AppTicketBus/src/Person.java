public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private long cardNumber;
    private long hashPass;
    private String login;

    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public long getHashPass() {
        return this.hashPass;
    }
    public void setLogin(long hashPass) {
        this.hashPass = hashPass;
    }
}
