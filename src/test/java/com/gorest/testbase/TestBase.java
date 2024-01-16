package com.gorest.testbase;

import com.gorest.utils.TestUtils;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class TestBase extends TestUtils {

    @BeforeClass
    public void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2";
    }
}
