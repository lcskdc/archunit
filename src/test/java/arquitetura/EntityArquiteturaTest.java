package arquitetura;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "..br.com.archunit.entity..", importOptions = {ImportOption.DoNotIncludeTests.class})
class EntityArquiteturaTest {

    @ArchTest
    static final ArchRule classThatResideInEntityShouldBeEntityAnnotation =
            ArchRuleDefinition.classes()
                    .should().beAnnotatedWith(javax.persistence.Entity.class).as("Classes do pacote entity devem estar anotadas com @Entity");

    @ArchTest
    static final ArchRule classThatResideInEntityShouldBeDefaultConstructor =
            ArchRuleDefinition.classes()
                    .should(ArchUnitExtensions.haveDefaultConstructor()).as("Classes do pacote Entity devem ter um construtor padrão");

}