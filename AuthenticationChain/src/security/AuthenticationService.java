package security;

import handlers.AuthenticationHandler;
import models.User;

public class AuthenticationService {

    private AuthenticationHandler handler;

    public AuthenticationService(AuthenticationHandler handler) {
        this.handler = handler;
    }

    public boolean authenticate(User user) {
        if (handler != null) {
            return handler.authenticate(user);
        }
        return false;
    }
}
