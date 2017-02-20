package NegativeTests;

import RegistrationPageLocators.RegistrationPageLocators;
import SomeFeatures.SomeFeatures;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Дима on 19.02.2017.
 */
public class CreateNewUserNegative extends SomeFeatures{


    @Test
    public void createNewUserWithUsedEmail() {

        String randomUser = randomString(7);
        fillingMainFieldsOnRegistrationPage("testew", "tester2", "899999999999", randomUser, "test@mail.ru", "12345678", "12345678");


        //Убедиться, что появляется текст "Error:  E-mail address already exists"
        String msgFailRegistration = driver.findElement(By.xpath(RegistrationPageLocators.EMAIL_ERROR)).getText();
        Assert.assertTrue(msgFailRegistration.equals("Error: E-mail address already exists"));
        System.out.println("Appears notification with text 'Error: E-mail address already exists'");

    }

    @Test
    public void createNewUserWithUsedUsername() {
        String randomMail = randomString(7);
        fillingMainFieldsOnRegistrationPage("testew", "tester2", "899999999999", "test", randomMail+"@mail.ru", "12345678", "12345678");

        //Убедиться, что появляется текст "Error: Username already exists"
        String msgFailRegistration = driver.findElement(By.xpath(RegistrationPageLocators.USERNAME_ERROR)).getText();
        Assert.assertTrue(msgFailRegistration.equals("Error: Username already exists"));
        System.out.println("Appears notification with text 'Error: Username already exists'");

        //driver.quit();
    }


}
