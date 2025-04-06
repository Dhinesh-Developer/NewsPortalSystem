package com.news.NewsPortal.Exception;

public class NewsException extends Exception{

    @Override
    public String getMessage() {
        return "Data Not Found : 404 Error";
    }
}
