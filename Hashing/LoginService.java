package com.hashing;
import java.util.HashMap;
import java.util.Map;
public class LoginService{
    Map<String,String> map = new HashMap<>();
    public LoginService(){
        map.put("admin","admin@123");
        map.put("user","user@123");
        map.put("guest","guest@123");
    }
    public boolean validate(String username, String password){
        if(map.containsKey(username)){
            if(map.get(username).equals(password)){
                return true;
            }
        }
        return false;
    }
}