package co.com.bancolombia.certification.guru99.models;

public class DataLogin {
    private String id;
    private String password;

    public DataLogin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setUserId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
