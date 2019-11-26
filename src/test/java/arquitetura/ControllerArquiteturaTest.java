package arquitetura;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "..br.com.archunit.controller..", importOptions = {ImportOption.DoNotIncludeTests.class})
class ControllerArquiteturaTest {

    @ArchTest
    static final ArchRule classThatResideInControllerPackageShouldBeHaveControllerSufix =
            ArchRuleDefinition.classes()
                    .should().haveSimpleNameEndingWith("Controller").as("Classes do pacote controller devem terminar com Controller. Ex.: classeController");

    @ArchTest
    static final ArchRule classThatResideInControllerPackageShouldBeControllerAnnotation =
            ArchRuleDefinition.classes()
                    .should().beAnnotatedWith(org.springframework.stereotype.Controller.class).as("Classes do pacote controller devem ser anotadas com @Controller");

}