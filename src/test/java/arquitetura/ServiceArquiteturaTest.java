package arquitetura;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "..br.com.archunit.service..", importOptions = {ImportOption.DoNotIncludeTests.class})
class ServiceArquiteturaTest {

    @ArchTest
    static final ArchRule classThatResideInServicePackageShouldBeHaveControllerSufix =
            ArchRuleDefinition.classes()
                    .should().haveSimpleNameEndingWith("Service");

    @ArchTest
    static final ArchRule classThatResideInServicePackageShouldBeServiceAnnotation =
            ArchRuleDefinition.classes()
                    .should().beAnnotatedWith(org.springframework.stereotype.Service.class);

}