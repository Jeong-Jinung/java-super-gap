package com.example.jinung.part3.ch05.ioc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder implements IEncoder{

    @Override
    public String encode(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}