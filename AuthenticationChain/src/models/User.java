package models;

public class User {
    private String username;
    private String password;
    private String twoFactorAuth;
    private String biometricAuth;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean hasUsernamePassword() {
        return username != null && password != null;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTwoFactorAuth() {
        return twoFactorAuth;
    }

    public void setTwoFactorAuth(String twoFactorAuth) {
        this.twoFactorAuth = twoFactorAuth;
    }

    public boolean hasTwoFactorAuth() {
        return twoFactorAuth != null;
    }

    public String getBiometricAuth() {
        return biometricAuth;
    }

    public void setBiometricAuth(String biometricAuth) {
        this.biometricAuth = biometricAuth;
    }

    public boolean hasBiometricAuth() {
        return biometricAuth != null;
    }
}
