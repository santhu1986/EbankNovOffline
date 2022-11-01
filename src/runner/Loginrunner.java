package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\SepEvngBatch\\Ebanking_Cucumber\\src\\feature\\Alogin.feature",
                  "D:\\SepEvngBatch\\Ebanking_Cucumber\\src\\feature\\Role.feature"},
                     glue="stepdefination",monochrome=true,
                  plugin={"pretty","json:Target/Role/RoleResult.json"})
public class Loginrunner 
{

}
