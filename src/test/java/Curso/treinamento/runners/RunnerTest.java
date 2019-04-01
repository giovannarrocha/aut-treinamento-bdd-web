package Curso.treinamento.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
// Executar com o plugin do Cucumber automaticamente 

@CucumberOptions(
		features = { "src\\test\\resources\\Features" },
		// aponta para o diretorio onde esta a feature 
		glue = {"Curso.treinamento.steps"},
		// aponta onde estão os steps 
		snippets = SnippetType.CAMELCASE,
		tags={"@Sprint1"}
		)
public class RunnerTest {

}
