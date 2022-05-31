package org.pojo;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email")
	private WebElement txtusername;
	
	@FindBy(id="Password")
	
	private WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnlogin;
	
	
	

	public WebElement getTxtusername() {
		
		return txtusername;
	}

	public void setTxtusername(WebElement txtusername) {
		
		this.txtusername = txtusername;
	}

	public WebElement getTxtpassword() {
		
		return txtpassword;
	}

	public void setTxtpassword(WebElement txtpassword) {
		this.txtpassword = txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(WebElement btnlogin) {
		this.btnlogin = btnlogin;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
