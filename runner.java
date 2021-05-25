package assessmentpackage;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

public class runner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src\\assessmentpackage\\scenario"},
			glue={"src\\assessmentpackage\\stepdefintionn"},
			plugin={"pretty", html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json"}	
			)
	public class TaggedHooksRunner {
		
	}

}
