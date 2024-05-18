import handlers.implementations.BiometricAuthHandler;
import handlers.implementations.TwoFactorAuthHandler;
import handlers.implementations.UsernamePasswordAuthHandler;
import models.User;
import security.AuthenticationService;

public class App {
    public static void main(String[] args) throws Exception {

        //Chain of responsibility pattern
        BiometricAuthHandler biometricHandler = new BiometricAuthHandler();
        TwoFactorAuthHandler twoFactorAuthHandler = new TwoFactorAuthHandler();
        UsernamePasswordAuthHandler usernamePasswordAuthHandler = new UsernamePasswordAuthHandler();
        twoFactorAuthHandler.setNext(usernamePasswordAuthHandler);
        biometricHandler.setNext(twoFactorAuthHandler);

        //Authentication service
        AuthenticationService authService = new AuthenticationService(biometricHandler);

        //User object with username, password, two factor and biometric authentication
        User user = new User("username", "password");
        user.setBiometricAuth("finger print");
        user.setTwoFactorAuth("123456");

        //Message will be printed based on the authentication status
        String message = authService.authenticate(user) ? " is authenticated": " is not authenticated";
        System.out.println("User "+ user.getUsername() + message);
    }
}
