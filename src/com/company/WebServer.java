package com.company;

import com.company.handlers.RequestHandler;

import java.util.ArrayList;
import java.util.List;

public class WebServer implements WebRequestObservable{
    private RequestHandler handler;
    private final List<WebRequestObserver> observers;

    public WebServer() {
        this.observers = new ArrayList<>();
    }

    public String getRequest(WebRequest request) {
        notifyObservers(request);
        return handler.handleRequest(request);
    }

    @Override
    public void attach(WebRequestObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(WebRequestObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(WebRequest webRequest) {
        observers.forEach(o -> o.update(webRequest));
    }

    public void setInitialHandler(RequestHandler handler) {
        this.handler = handler;
    }
}
