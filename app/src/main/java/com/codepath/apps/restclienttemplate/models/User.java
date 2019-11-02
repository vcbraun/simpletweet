package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    String name;
    public String screenName;
    public String imgURL;

    public static User fromJSon(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.imgURL = jsonObject.getString("profile_image_url_https");
        return user;
    }
}
