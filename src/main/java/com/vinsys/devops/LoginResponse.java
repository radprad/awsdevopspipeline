package com.vinsys.devops;

public class LoginResponse {
    private int status;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public int  getStatus() {
        return status;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
