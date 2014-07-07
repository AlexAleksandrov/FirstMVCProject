package service;

/**
 * Created by AALEKSANDROV on 07.07.14.
 */
public class LoginService {

    public static boolean authentificate(String userId, String password){
        if(password == null || password.trim() == "")
            return  false;
        else
            return  true;

    }
}
