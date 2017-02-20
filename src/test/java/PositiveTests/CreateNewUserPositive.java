package PositiveTests;

import RegistrationPageLocators.RegistrationPageLocators;
import SomeFeatures.SomeFeatures;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Дима on 19.02.2017.
 */
public class CreateNewUserPositive extends SomeFeatures {

    @Test
    public void createNewUser() {

        setUp();
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(RegistrationPageLocators.URL);
        driver.findElement(By.xpath(RegistrationPageLocators.TITLE));

        //Заполнить поле "First Name"
        driver.findElement(By.xpath(RegistrationPageLocators.FIRST_NAME)).sendKeys("Test");
        System.out.println("Field 'First Name' has been filled");

        //Заполнить поле "Last Name"
        driver.findElement(By.xpath(RegistrationPageLocators.LAST_NAME)).sendKeys("Test2");
        System.out.println("Field 'Last Name' has been filled");

        //В поле "Marital Status" установить флажок на radio button
        driver.findElement(By.xpath(RegistrationPageLocators.MARITAL_STATUS)).click();
        System.out.println("In the field 'Marital Status' status 'Single' has been selected");

        //В поле "Hobby" установить чекбоксы во всех вариантах
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_DANCE)).click();
        System.out.println("In the field 'Hobby' status 'Dance' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_CRICKET)).click();
        System.out.println("In the field 'Hobby' status 'Cricket' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_READING)).click();
        System.out.println("In the field 'Hobby' status 'Reading' has been selected");

        //В поле "Country" выбрать в выпадающем списке страну
        Select dropDownList = new Select(driver.findElement(By.id(RegistrationPageLocators.COUNTRY)));
        dropDownList.selectByVisibleText("Russia");
        System.out.println("In the drop down list 'Country' has been selected 'Russia'");

        //В поле "Date of Birth" установить в выпадающем списке дату
        Select dropDownDate = new Select(driver.findElement(By.id(RegistrationPageLocators.DATE)));
        dropDownDate.selectByVisibleText("1");
        System.out.println("In the drop down list 'Date' has been selected '1'");

        Select dropDownMonth = new Select(driver.findElement(By.id(RegistrationPageLocators.MONTH)));
        dropDownMonth.selectByVisibleText("1");
        System.out.println("In the drop down list 'Month' has been selected '1'");

        Select dropDownYear = new Select(driver.findElement(By.id(RegistrationPageLocators.YEAR)));
        dropDownYear.selectByVisibleText("2000");
        System.out.println("In the drop down list 'Month' has been selected '2000'");

        //В поле "Phone Number" ввести номер телефона
        driver.findElement(By.xpath(RegistrationPageLocators.PHONE_NUMBER)).sendKeys("89001112233");
        System.out.println("Field 'Phone number' has been filled");

        //Заполнить поле "Username"
        String randomString = randomString(9);
        driver.findElement(By.xpath(RegistrationPageLocators.USERNAME)).sendKeys(randomString);
        System.out.println("Field 'Username' has been filled");

        //Заполнить поле "E-mail"
        randomString = randomString(6);
        driver.findElement(By.xpath(RegistrationPageLocators.E_MAIL)).sendKeys(randomString+"@mail.ru");
        System.out.println("Field 'E-mail' has been filled");

        //В поле "Your Profile Picture" выбрать файл
        driver.findElement(By.xpath(RegistrationPageLocators.PROFILE_PICTURE)).sendKeys("D:\\audi_15.png");
        System.out.println("In the 'Your Profile Picture' has been selected file with the extension .PNG");

        //Заполнить поле "About Yourself"
        randomString = randomString(15);
        driver.findElement(By.xpath(RegistrationPageLocators.ABOUT_YUORSELF)).sendKeys(randomString);
        System.out.println("Field 'About Yourself' has been filled");

        //Заполнить поле "Password"
        driver.findElement(By.xpath(RegistrationPageLocators.PASSWORD)).sendKeys("fgdfbxbxge124");
        System.out.println("Field 'Password' has been filled");

        //Заполнить поле "Confirm Password"
        driver.findElement(By.xpath(RegistrationPageLocators.CONFIRM_PASSWORD)).sendKeys("fgdfbxbxge124");
        System.out.println("Field 'Confirm Password' has been filled");

        //Нажать кнопку "Submit"
        driver.findElement(By.xpath(RegistrationPageLocators.SUBMIT_BTN)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("'Submit' button has been clicked");

        //Убедиться, что появляется текст "Thank you for your registration"
        String msgSuccefullRegistaration = driver.findElement(By.xpath(RegistrationPageLocators.SUCCEFULL_REGISTRATION)).getText();
        Assert.assertTrue(msgSuccefullRegistaration.equals("Thank you for your registration"));
        System.out.println("Appears notification with text 'Thank you for your registration'");

        //driver.quit();
    }



}
