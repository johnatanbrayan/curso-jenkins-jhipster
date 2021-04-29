package com.jhipster.demo.blog.web.rest.vm;

import com.jhipster.demo.blog.GeneratedByJHipster;

/**
 * View Model object for storing the user's key and password.
 */
@GeneratedByJHipster
public class KeyAndPasswordVM {

    private String key;

    private String newPassword;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
