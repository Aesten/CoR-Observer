package com.company.handlers;

import com.company.WebRequest;

public class ExistingContentCheckRequestHandler extends RequestHandler{
    @Override
    public String handleRequest(WebRequest request) {
        if (request.getPath().equals("/dashboard") || request.getPath().equals("/home")) {
            return this.successor.handleRequest(request); //Pass to next handler if check successful
        }
        else {
            return "Status 404 : Page missing";
        }
    }
}
