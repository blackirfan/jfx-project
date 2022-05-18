package sample;

public class Admin {

    public String usernames;
    public String password;


    public Admin(String username, String password) {

        this.usernames = username;
        this.password = password;

    }


    public String getUsername() {
        return usernames;
    }
    public String getPassword() {
        return password;
    }


}

