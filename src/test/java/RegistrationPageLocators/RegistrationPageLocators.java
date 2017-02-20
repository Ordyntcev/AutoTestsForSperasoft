package RegistrationPageLocators;

/**
 * Created by Дима on 19.02.2017.
 */
public class RegistrationPageLocators {
    final public static String URL = "http://demoqa.com/registration/";
    final public static String TITLE = "//header[contains(@class, 'entry-header page-header')]/h1";
    final public static String FIRST_NAME = "//input[contains(@name, 'first_name')]";
    final public static String LAST_NAME = "//input[contains(@name, 'last_name')]";
    final public static String MARITAL_STATUS = "//input[contains(@value, 'single')]";
    final public static String HOBBY_DANCE = "//input[contains(@value, 'dance')]";
    final public static String HOBBY_READING = "//input[contains(@value, 'reading')]";
    final public static String HOBBY_CRICKET = "//input[contains(@value, 'cricket ')]";
    final public static String COUNTRY = "dropdown_7";
    final public static String MONTH = "mm_date_8";
    final public static String DATE = "dd_date_8";
    final public static String YEAR = "yy_date_8";
    final public static String PHONE_NUMBER = "//input[contains(@name, 'phone_9')]";
    final public static String USERNAME = "//input[contains(@name, 'username')]";
    final public static String E_MAIL = "//input[contains(@name, 'e_mail')]";
    final public static String PROFILE_PICTURE = "//input[contains(@name, 'profile_pic_10')]";
    final public static String ABOUT_YUORSELF = "//textarea[contains(@name, 'description')]";
    final public static String PASSWORD = "//input[contains(@name, 'password')]";
    final public static String CONFIRM_PASSWORD = "//input[contains(@id, 'confirm_password_password_2')]";
    final public static String SUBMIT_BTN = "//input[contains(@name, 'pie_submit')]";
    final public static String SUCCEFULL_REGISTRATION = "//p[contains(@class, 'piereg_message')]";
    final public static String USERNAME_ERROR = "//p[contains(@class, 'piereg_login_error')]";
    final public static String EMAIL_ERROR = "//p[contains(@class, 'piereg_login_error')]";
    final public static String RED_FRAME_NAME = "//div[contains(@class, 'fieldset error')]/label[.='First Name']";
    final public static String RED_FRAME_LAST_NAME = "//div[contains(@class, 'fieldset error')]//div[1]/label[.='Last Name']";
    final public static String RED_FRAME_HOBBY = "//div[contains(@class, 'fieldset error')]/label[.='Hobby']";
    final public static String RED_FRAME_PHONE_NUMBER = "//div[contains(@class, 'fieldset error')]/label[.='Phone Number']";
    final public static String RED_FRAME_USER_NAME = "//div[contains(@class, 'fieldset error')]/label[.='Username']";
    final public static String RED_FRAME_EMAIL = "//div[contains(@class, 'fieldset error')]/label[.='E-mail']";
    final public static String RED_FRAME_PASSWORD = "//div[contains(@class, 'fieldset error')]/label[.='Password']";
    final public static String RED_FRAME_CONFIRM_PASSWORD= "//div[contains(@class, 'fieldset error')]/label[.='Confirm Password']";
}
