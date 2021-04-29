package com.jhipster.demo.blog.service;

import com.jhipster.demo.blog.GeneratedByJHipster;

@GeneratedByJHipster
public class UsernameAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Login name already used!");
    }
}
