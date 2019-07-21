package com.fh.factory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShiroFilterDefinitionMapFactory {

    public LinkedHashMap init(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("/login", "anon");
        map.put("/userLogin", "anon");
        map.put("/user", "user,roles[user]");
        map.put("/logout", "logout");
        map.put("/admin", "roles[admin]");
        map.put("/**", "authc");
        return map;
    }
}
