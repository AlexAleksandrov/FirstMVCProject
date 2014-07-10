package service;

import dto.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AALEKSANDROV on 07.07.14.
 */
public class LoginService {
    Map<String,String> userIdAndName = new HashMap<String,String>();

    public boolean authentificate(String userId, String password){

        if(password == null || password.trim() == "")

            return  false;
        else
            return  true;

    }

    public LoginService(){

        userIdAndName.put("johndoe", "John Doe");
        userIdAndName.put("janedoe","Jane Doe");
        userIdAndName.put("jdev","Java Developer");
    }

    public User getUser(String userId){
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userIdAndName.get(userId));

        return user;
    }
}
