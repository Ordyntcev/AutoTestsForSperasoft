package SomeFeatures;

import RegistrationPageLocators.RegistrationPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Дима on 19.02.2017.
 */
public class SomeFeatures {

    protected WebDriver driver;

    protected WebDriver getDriver(){
        return driver;
    }

    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "D:\\Mozila\\firefox.exe");
    }

    public String randomString(int length) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }

    protected void fillingMainFieldsOnRegistrationPage(String firstName, String lastName, String phoneNumber, String userName, String email, String password, String confirmPassword ){
        getDriver();
        setUp();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(RegistrationPageLocators.URL);


        driver.findElement(By.xpath(RegistrationPageLocators.TITLE));
        //Заполнить поле "First Name"
        driver.findElement(By.xpath(RegistrationPageLocators.FIRST_NAME)).sendKeys(firstName);
        System.out.println("Field 'First Name' has been filled");

        //Заполнить поле "Last Name"
        driver.findElement(By.xpath(RegistrationPageLocators.LAST_NAME)).sendKeys(lastName);
        System.out.println("Field 'Last Name' has been filled");

        //В поле "Hobby" установить чекбоксы во всех вариантах
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_DANCE)).click();
        System.out.println("In the field 'Hobby' status 'Dance' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_CRICKET)).click();
        System.out.println("In the field 'Hobby' status 'Cricket' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_READING)).click();
        System.out.println("In the field 'Hobby' status 'Reading' has been selected");

        //В поле "Phone Number" ввести номер телефона
        driver.findElement(By.xpath(RegistrationPageLocators.PHONE_NUMBER)).sendKeys(phoneNumber);
        System.out.println("Field 'Phone number' has been filled");

        //Заполнить поле "Username"
        driver.findElement(By.xpath(RegistrationPageLocators.USERNAME)).sendKeys(userName);
        System.out.println("Field 'Username' has been filled");

        //Заполнить поле "E-mail"
        driver.findElement(By.xpath(RegistrationPageLocators.E_MAIL)).sendKeys(email);
        System.out.println("Field 'E-mail' has been filled");

        //Заполнить поле "Password"
        driver.findElement(By.xpath(RegistrationPageLocators.PASSWORD)).sendKeys(password);
        System.out.println("Field 'Password' has been filled");

        //Заполнить поле "Confirm Password"
        driver.findElement(By.xpath(RegistrationPageLocators.CONFIRM_PASSWORD)).sendKeys(confirmPassword);
        System.out.println("Field 'Confirm Password' has been filled");

        //Нажать кнопку "Submit"
        driver.findElement(By.xpath(RegistrationPageLocators.SUBMIT_BTN)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("'Submit' button has been clicked");
    }

    protected void fillingMainFieldsOnRegistrationPageWithoutGetURL(WebDriver driver,String firstName, String lastName, String phoneNumber, String userName, String email, String password, String confirmPassword ){

        //Заполнить поле "First Name"
        driver.findElement(By.xpath(RegistrationPageLocators.FIRST_NAME)).sendKeys(firstName);
        System.out.println("Field 'First Name' has been filled");

        //Заполнить поле "Last Name"
        driver.findElement(By.xpath(RegistrationPageLocators.LAST_NAME)).sendKeys(lastName);
        System.out.println("Field 'Last Name' has been filled");

        //В поле "Hobby" установить чекбоксы во всех вариантах
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_DANCE)).click();
        System.out.println("In the field 'Hobby' status 'Dance' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_CRICKET)).click();
        System.out.println("In the field 'Hobby' status 'Cricket' has been selected");
        driver.findElement(By.xpath(RegistrationPageLocators.HOBBY_READING)).click();
        System.out.println("In the field 'Hobby' status 'Reading' has been selected");

        //В поле "Phone Number" ввести номер телефона
        driver.findElement(By.xpath(RegistrationPageLocators.PHONE_NUMBER)).sendKeys(phoneNumber);
        System.out.println("Field 'Phone number' has been filled");

        //Заполнить поле "Username"
        driver.findElement(By.xpath(RegistrationPageLocators.USERNAME)).sendKeys(userName);
        System.out.println("Field 'Username' has been filled");

        //Заполнить поле "E-mail"
        driver.findElement(By.xpath(RegistrationPageLocators.E_MAIL)).sendKeys(email);
        System.out.println("Field 'E-mail' has been filled");

        //Заполнить поле "Password"
        driver.findElement(By.xpath(RegistrationPageLocators.PASSWORD)).sendKeys(password);
        System.out.println("Field 'Password' has been filled");

        //Заполнить поле "Confirm Password"
        driver.findElement(By.xpath(RegistrationPageLocators.CONFIRM_PASSWORD)).sendKeys(confirmPassword);
        System.out.println("Field 'Confirm Password' has been filled");

        //Нажать кнопку "Submit"
        driver.findElement(By.xpath(RegistrationPageLocators.SUBMIT_BTN)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("'Submit' button has been clicked");
    }

}
