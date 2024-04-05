package com.example.sporterz_mobile;

import android.graphics.drawable.Icon;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeItem {
    private String username;
    private String thinking;
    private String postDate;

    public HomeItem(String username, String thinking, String postDate) {
        this.username = username;
        this.thinking = thinking;
        this.postDate = postDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getThinking() {
        return thinking;
    }

    public void setThinking(String thinking) {
        this.thinking = thinking;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}
