package com.jhipster.demo.blog.service;

import com.jhipster.demo.blog.GeneratedByJHipster;

@GeneratedByJHipster
public class EmailAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedException() {
        super("Email is already in use!");
    }
}
