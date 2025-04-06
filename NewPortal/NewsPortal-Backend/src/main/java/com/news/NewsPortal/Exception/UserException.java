package com.news.NewsPortal.Exception;

public class UserException extends Exception{

    public String UserException(String userNotFound) {
        return userNotFound;
    }

    public String getMessage(String message) {
        return message;
    }
}
