package com.xd.util;

import java.security.MessageDigest;

public class Md5Util {
    public Md5Util(){}

    private String[] hex = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

    public String encodeByMd5(String password) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] byteArary = md5.digest(password.getBytes());
        return byteArrayToHexString(byteArary);
    }

    private String byteArrayToHexString(byte[] byteArray) throws Exception{
        StringBuffer sb = new StringBuffer();
        //迭代
        for(byte b : byteArray){
            String hexString = byteToHexString(b);
            sb.append(hexString);
        }
        return sb.toString();
    }

    private String byteToHexString(byte b) throws Exception{
        int n = b;
        if(n < 0){
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hex[d1] + hex[d2];
    }
}
