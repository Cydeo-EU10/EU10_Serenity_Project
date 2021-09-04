package b22.spartan;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utilities.ConfigReader;
@Disabled
public class ConfigDemoTest {

    @Test
    public void test1(){
        System.out.println(ConfigReader.getProperty("serenity.project.name"));
        System.out.println(ConfigReader.getProperty("spartan.editor.username"));

    }
}
