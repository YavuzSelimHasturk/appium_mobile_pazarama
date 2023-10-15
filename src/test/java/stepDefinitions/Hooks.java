package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.testng.annotations.AfterTest;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Hooks {
    @BeforeAll
    public static void openCMD() throws IOException {


        try {
            String command = "cmd /c start appium";
            //Starting the new child process
            Process childprocess11 = Runtime.getRuntime().exec(command);
            System.out.println("The child process is Alive: " + childprocess11.isAlive());
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        ReusableMethods.wait(10);
    }

    @AfterAll
    public static void openAllure() throws IOException {

        try {
            String command = "cmd /c allure serve allure-results";
            //Starting the new child process
            Process childprocess11 = Runtime.getRuntime().exec(command);
            System.out.println("The child process is Alive: " + childprocess11.isAlive());
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        ReusableMethods.wait(10);
    }



}
