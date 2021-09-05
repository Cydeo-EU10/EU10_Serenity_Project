package b22.bookit;

import net.serenitybdd.junit5.SerenityTest;
import org.junit.jupiter.api.Test;
import utilities.ConfigReader;

@SerenityTest
public class BookitEnvTest {


        @Test
         public void test1(){

            System.out.println(ConfigReader.getProperty("base.url"));
            System.out.println(ConfigReader.getProperty("teacher_email"));
            System.out.println(ConfigReader.getProperty("teacher_password"));
            System.out.println(ConfigReader.getProperty("base_path"));
        }

}
