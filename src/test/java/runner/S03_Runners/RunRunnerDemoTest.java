package runner.S03_Runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@IncludeTags("S03")
@SelectClasspathResource("features")
@ConfigurationParameters({@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefs")
        , @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//        , @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:report/cucumber_report.html")
        , @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "junit:report/cucumber.xml")
        , @ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
})
public class RunRunnerDemoTest {
}
