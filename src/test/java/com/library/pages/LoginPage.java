package com.library.pages;

import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "inputEmail")
    private WebElement emailInputBox;

    @FindBy(id="inputPassword")
    private WebElement passwordInputBox;
    
    @FindBy(id="inputEmail-error")
    private WebElement warningMessage;

    public void login(String userNameValue,String passwordValue){
        emailInputBox.sendKeys(userNameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }
    public void login(){
        String userNameValue = ConfigurationReader.getProperty("librarian.username");
        String passwordValue = ConfigurationReader.getProperty("librarian.password");
        emailInputBox.sendKeys(userNameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }
    public void login(String role){
        String userNameValue = "";
        String passwordValue = "";
        if (role.equalsIgnoreCase("librarian")){
            userNameValue=ConfigurationReader.getProperty("librarian.username");
            passwordValue=ConfigurationReader.getProperty("librarian.password");
        }else if (role.equalsIgnoreCase("student1")){
            userNameValue=ConfigurationReader.getProperty("student1.username");
            passwordValue=ConfigurationReader.getProperty("student1.password");
        }else if(role.equalsIgnoreCase("student2")){
            userNameValue=ConfigurationReader.getProperty("student2.username");
            passwordValue=ConfigurationReader.getProperty("student2.password");
        }
        emailInputBox.sendKeys(userNameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }


}
