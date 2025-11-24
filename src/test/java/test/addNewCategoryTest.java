package test;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class addNewCategoryTest {

    @BeforeClass
    public static void login() throws IOException {
        LoginTest lt =new LoginTest();
        lt.validLogin();
    }
}
