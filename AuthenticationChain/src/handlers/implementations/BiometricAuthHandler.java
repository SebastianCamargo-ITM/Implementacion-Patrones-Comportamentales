package handlers.implementations;

import handlers.AuthenticationHandler;
import models.User;

public class BiometricAuthHandler implements AuthenticationHandler {

    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public boolean authenticate(User user) {
        if (user.hasBiometricAuth()) {
            return checkBiometricAuth(user);
        } else if (next != null) {
            return next.authenticate(user);
        }
        return false;
    }

    private boolean checkBiometricAuth(User user) {
        return user.getBiometricAuth().equals("fingerprint");
    }
}
