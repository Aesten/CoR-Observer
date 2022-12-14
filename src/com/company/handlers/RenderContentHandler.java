package com.company.handlers;

import com.company.WebRequest;

public class RenderContentHandler extends RequestHandler {

    @Override
    public String handleRequest(WebRequest request) {
        return request.getPath().equals("/home") ? "Status 200 : Home content here" : "Status 200 : Dashboard content here";
    }
}
