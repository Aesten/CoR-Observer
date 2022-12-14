package com.company;

public class WebRequest {
    private String path;
    private User loggedUser;

    public WebRequest(String path, User loggedUser) {
        this.path = path;
        this.loggedUser = loggedUser;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
