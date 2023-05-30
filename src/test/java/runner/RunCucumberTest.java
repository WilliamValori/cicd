package runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@IncludeTags("S13&Henk")
@SelectClasspathResource("features")
@ConfigurationParameters({@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefs"),
        @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty"),
        @ConfigurationParameter(key = PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME, value = "true"),
        @ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
})
public class RunCucumberTest {
}
