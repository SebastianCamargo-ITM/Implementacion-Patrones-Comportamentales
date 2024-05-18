package handlers.implementations;

import handlers.AuthenticationHandler;
import models.User;

public class TwoFactorAuthHandler implements AuthenticationHandler{

    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public boolean authenticate(User user) {
        if (user.hasTwoFactorAuth()) {
            return checkTwoFactorAuth(user);
        } else if (next != null) {
            return next.authenticate(user);
        }
        return false;
    }
    
    private boolean checkTwoFactorAuth(User user) {
        return user.getTwoFactorAuth().equals("123456");
    }
}
