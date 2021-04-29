package com.jhipster.demo.blog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.jhipster.demo.blog.GeneratedByJHipster;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

@GeneratedByJHipster
class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.jhipster.demo.blog");

        noClasses()
            .that()
            .resideInAnyPackage("com.jhipster.demo.blog.service..")
            .or()
            .resideInAnyPackage("com.jhipster.demo.blog.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.jhipster.demo.blog.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
