package com.company.handlers;

import com.company.WebRequest;

public class PolicyCheckRequestHandler extends RequestHandler {
    @Override
    public String handleRequest(WebRequest request) {
        if (request.getPath().equals("/dashboard") && !request.getLoggedUser().isAdmin()) {
            return "Status 403 : user is not authorized to access this content";
        }
        else {
            return this.successor.handleRequest(request); //Pass to next handler if check successful
        }
    }
}
