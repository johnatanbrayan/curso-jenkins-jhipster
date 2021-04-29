package com.jhipster.demo.blog.service;

import com.jhipster.demo.blog.GeneratedByJHipster;

@GeneratedByJHipster
public class InvalidPasswordException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("Incorrect password");
    }
}
