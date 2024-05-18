package handlers.implementations;

import handlers.AuthenticationHandler;
import models.User;

public class UsernamePasswordAuthHandler implements AuthenticationHandler{

    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public boolean authenticate(User user) {
        if (user.hasUsernamePassword()) {
            return checkUsernamePassword(user);
        } else if (next != null) {
            return next.authenticate(user);
        }
        return false;
    }
    
    private boolean checkUsernamePassword(User user) {
        return user.getUsername().equals("admin") && user.getPassword().equals("admin");
    }
}
