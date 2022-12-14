package com.company.handlers;

import com.company.WebRequest;

/**
 * The abstract RequestHandler class
 * Allows to chain RequestHandlers and defines one abstract method: String handleRequest(WebRequest request)
 */
public abstract class RequestHandler {
    protected RequestHandler successor; //protected to grant access for subclasses to pass the request

    public abstract String handleRequest(WebRequest request);

    public void setSuccessor(RequestHandler successor) {
        this.successor = successor;
    }
}
