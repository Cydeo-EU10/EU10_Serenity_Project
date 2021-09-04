package b22.spartan.editor;

import utilities.SpartanNewBase;
import io.restassured.http.ContentType;
import net.serenitybdd.junit5.SerenityTest;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanUtil;

import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.given;

@SerenityTest
public class SpartanEditorPostTest extends SpartanNewBase {

        @DisplayName("Editor should be able to POST")
        @Test
        public void postSpartanAsEditor(){
            //create one spartan using util
            Map<String,Object> bodyMap = SpartanUtil.getRandomSpartanMap();

            System.out.println("bodyMap = " + bodyMap);

            //send a post request as editor




        }

}
