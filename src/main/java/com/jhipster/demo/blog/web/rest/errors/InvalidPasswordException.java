package com.jhipster.demo.blog.web.rest.errors;

import com.jhipster.demo.blog.GeneratedByJHipster;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

@GeneratedByJHipster
public class InvalidPasswordException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super(ErrorConstants.INVALID_PASSWORD_TYPE, "Incorrect password", Status.BAD_REQUEST);
    }
}
