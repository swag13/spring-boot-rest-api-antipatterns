package com.swag.test;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;


@AnalyzeClasses(packages = "com.swag") // Root package of your project
public class ArchUnit {
	@ArchTest
	static final ArchRule controllers_should_not_access_repository_directly =
	            noClasses()
     	    .that().resideInAPackage("..controller..")
     	    .should().accessClassesThat().resideInAPackage("..repository..")
     	    .allowEmptyShould(true)
     	    .because("controller should not directly access repositories");

}
