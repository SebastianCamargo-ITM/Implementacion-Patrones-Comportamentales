package handlers;

import models.User;

public interface AuthenticationHandler {
    void setNext(AuthenticationHandler handler);
    boolean authenticate(User user);
}
