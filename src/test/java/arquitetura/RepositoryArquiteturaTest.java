package arquitetura;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "..br.com.archunit.repository..", importOptions = {ImportOption.DoNotIncludeTests.class})
class RepositoryArquiteturaTest {

    @ArchTest
    static final ArchRule classThatResideInRepositoryPackageShouldBeRepositoryNamePart =
            ArchRuleDefinition.classes()
                    .should().haveSimpleNameEndingWith("Repository").as("Classes do pacote repository devem terminar com Repository");

    @ArchTest
    static final ArchRule classThatResideInRepositoryPackageShouldBeRepositoryAnnotation =
            ArchRuleDefinition.classes()
                    .should().beAnnotatedWith(org.springframework.stereotype.Repository.class).as("Classes do pacote repository devem estar anotadas com @Repository");

}