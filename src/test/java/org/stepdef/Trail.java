package org.stepdef;

import java.util.List;
import java.util.Map;

import org.BaseClass.BaseClass;
import org.junit.Assert;
import org.pojo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trail extends BaseClass {

	LoginPage loginpage = new LoginPage();

	@Given("User is on login page")
	public void user_is_on_login_page() {
		loginpage.getTxtusername().clear();
		loginpage.getTxtpassword().clear();
	}

	@When("user enters the email and password using dataTable oneD List")
	public void user_enters_the_email_and_password_using_dataTable_oneD_List(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> l = dataTable.asList();

		type(loginpage.getTxtusername(), l.get(0));
		type(loginpage.getTxtpassword(), l.get(1));
	}

	@When("user click login button")
	public void user_click_login_button() {
		click(loginpage.getBtnlogin());
	}

	@Then("User get validate the page")
	public void user_get_validate_the_page() {
		Assert.assertEquals(findLocatorXpath("//div[@class='content-header']").getText(), "Dashboard");
		System.out.println("verifyied the dashboard,its valid credentials");
	}

	@When("user enters the email and password using dataTable TwoD Lists")
	public void user_enters_the_email_and_password_using_dataTable_TwoD_Lists(
			io.cucumber.datatable.DataTable dataTable1) {
		List<List<String>> ls = dataTable1.asLists();
		type(loginpage.getTxtusername(), ls.get(0).get(0));
		type(loginpage.getTxtpassword(), ls.get(0).get(1));
	}

	@Then("User get validate the msg")
	public void user_get_validate_the_msg() {
		String s = "Defaults for admin area";
		String text = findLocatorXpath("//div[@class='topic-block-title']").getText();
		System.out.println(text);
		Assert.assertTrue(s.equalsIgnoreCase(text));
		System.out.println("validate the msg");

	}

	@When("user enters the email and password using dataTable OneD Map")
	public void user_enters_the_email_and_password_using_dataTable_OneD_Map(
			io.cucumber.datatable.DataTable dataTable2) {
		Map<String, String> map = dataTable2.asMap(String.class, String.class);
		type(loginpage.getTxtusername(), map.get("email"));
		type(loginpage.getTxtpassword(), map.get("password"));

	}

	@When("user enters the email and password using dataTable TwoD Maps")
	public void user_enters_the_email_and_password_using_dataTable_TwoD_Maps(
			io.cucumber.datatable.DataTable dataTable3) {
		List<Map<String, String>> maps = dataTable3.asMaps();
		type(loginpage.getTxtusername(), maps.get(1).get("email"));
		type(loginpage.getTxtpassword(), maps.get(1).get("password"));
	}
}
