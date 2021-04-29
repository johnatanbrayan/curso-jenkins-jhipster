package com.jhipster.demo.blog;

import com.jhipster.demo.blog.CursoJenkinsJhipsterApp;
import com.jhipster.demo.blog.GeneratedByJHipster;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = CursoJenkinsJhipsterApp.class)
public @interface IntegrationTest {
}
