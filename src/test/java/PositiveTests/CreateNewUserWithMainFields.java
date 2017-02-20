package PositiveTests;

import RegistrationPageLocators.RegistrationPageLocators;
import SomeFeatures.SomeFeatures;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Дима on 19.02.2017.
 */
public class CreateNewUserWithMainFields extends SomeFeatures{

    @Test
    public void tryingCreateNewUserWithEmptyFields(){
        setUp();
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(RegistrationPageLocators.URL);
        driver.findElement(By.xpath(RegistrationPageLocators.TITLE));

        //Нажать кнопку "Submit"
        driver.findElement(By.xpath(RegistrationPageLocators.SUBMIT_BTN)).click();
        System.out.println("'Submit' button has been clicked");

        //Убедиться, что красная рамка отображается в области поля "First Name"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_NAME));

        //Убедиться, что красная рамка отображается в области поля "Last Name"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_LAST_NAME));

        //Убедиться, что красная рамка отображается в области поля "Hobby"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_HOBBY));

        //Убедиться, что красная рамка отображается в области поля "Phone Number"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_PHONE_NUMBER));

        //Убедиться, что красная рамка отображается в области поля "User Name"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_USER_NAME));

        //Убедиться, что красная рамка отображается в области поля "E-mail"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_EMAIL));

        //Убедиться, что красная рамка отображается в области поля "Password"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_PASSWORD));

        //Убедиться, что красная рамка отображается в области поля "Confirm Password"
        driver.findElement(By.xpath(RegistrationPageLocators.RED_FRAME_CONFIRM_PASSWORD));

        //Заполнить все обязательные поля
        String randomUserOrMail = randomString(7);
        fillingMainFieldsOnRegistrationPageWithoutGetURL(driver,"testew", "tester2", "899999999999", randomUserOrMail, randomUserOrMail+"@mail.ru", "12345678", "12345678");

        String msgSuccefullRegistaration = driver.findElement(By.xpath(RegistrationPageLocators.SUCCEFULL_REGISTRATION)).getText();
        Assert.assertTrue(msgSuccefullRegistaration.equals("Thank you for your registration"));
        System.out.println("Appears notification with text 'Thank you for your registration'");

        //driver.quit();
    }


}
