package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
}
