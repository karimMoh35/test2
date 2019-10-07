package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProgBudget_Yearly extends PageBase{

	public CreateProgBudget_Yearly(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (id="CreateNewProgramYearlyBudgetButton")
	WebElement Create_newProg ;

	@FindBy (id="select2-programId-container")
	WebElement SelectProgram ;

	@FindBy (xpath = " //*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement ProgSearchField  ;

	@FindBy (id="select2-yearId-container")
	WebElement SelectYear ;

	@FindBy (xpath = "//*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement YearSearch  ;

	@FindBy (id="ProgramYearlyBudget_PerDeliveryPlanTotal")
	WebElement PerDeliveryPlanTotal  ;

	@FindBy (id="ProgramYearlyBudget_PerDeliveryPlanOPEX")
	WebElement PerDeliveryPlanOPEX ;

	@FindBy (id="ProgramYearlyBudget_PerDeliveryPlanCAPEX")
	WebElement PerDeliveryPlanCAPEX ;

	@FindBy (id="ProgramYearlyBudget_PerDeliveryPlanUnallocated")
	WebElement PerDeliveryPlanUnallocated ;

	@FindBy (id="ProgramYearlyBudget_CeilingTotal")
	WebElement CeilingTotal ;

	@FindBy (id="ProgramYearlyBudget_CeilingOPEX")
	WebElement CeilingOPEX ;

	@FindBy (id="ProgramYearlyBudget_CeilingCAPEX")
	WebElement CeilingCAPEX ;

	@FindBy (id="ProgramYearlyBudget_CeilingUnallocated")
	WebElement CeilingUnallocated ;

	@FindBy (id="ProgramYearlyBudget_RequestedforApprovalTotal")
	WebElement RequestedforApprovalTotal;

	@FindBy (id="ProgramYearlyBudget_RequestedforApprovalCAPEX")
	WebElement RequestedforApprovalCAPEX ;

	@FindBy (id="ProgramYearlyBudget_RequestedforApprovalOPEX")
	WebElement RequestedforApprovalOPEX ;

	@FindBy (id="ProgramYearlyBudget_RequestedforApprovalUnallocated")
	WebElement RequestedforApprovalUnallocated ;

	@FindBy (id="ProgramYearlyBudget_ApprovedFromCeilingTotal")
	WebElement ApprovedFromCeilingTotal ;

	@FindBy (id="ProgramYearlyBudget_ApprovedFromCeilingOPEX")
	WebElement ApprovedFromCeilingOPEX ;

	@FindBy (id="ProgramYearlyBudget_ApprovedFromCeilingCAPEX")
	WebElement ApprovedFromCeilingCAPEX ;

	@FindBy (id="ProgramYearlyBudget_ApprovedFromCeilingUnallocated")
	WebElement ApprovedFromCeilingUnallocated ;

	@FindBy (id="ProgramYearlyBudget_ApprovedOutofCeilingTotal")
	WebElement ApprovedOutofCeilingTotal ;

	@FindBy (id="ProgramYearlyBudget_ApprovedOutofCeilingOPEX")
	WebElement ApprovedOutofCeilingOPEX ;

	@FindBy (id="ProgramYearlyBudget_ApprovedOutofCeilingCAPEX")
	WebElement ApprovedOutofCeilingCAPEX ;
	
	@FindBy (id="ProgramYearlyBudget_ApprovedOutofCeilingUnallocated")
	WebElement ApprovedOutofCeilingUnallocated ;

	@FindBy (xpath = "//*[@id=\"saveBtn\"]/span")
	WebElement SaveBtn ;

	@FindBy (xpath = "//*[@id=\"Modal_2964141568891538233\"]/div/div/div[3]/button[1]")
	WebElement CancelBtn  ;


	public void Create_ProgYearlyBudget()
	{
		Create_newProg.click();
		SelectProgram.click();
		ProgSearchField.sendKeys("kareem.program");
		ProgSearchField.sendKeys(Keys.ENTER);
		// SelectProgram 

		SelectYear.click();
		YearSearch.sendKeys("2017");
		YearSearch.sendKeys(Keys.ENTER);

		// select Year 

		PerDeliveryPlanTotal.sendKeys("10000");
		PerDeliveryPlanOPEX.sendKeys("20000");
		PerDeliveryPlanCAPEX.sendKeys("30000");
		PerDeliveryPlanUnallocated.sendKeys("4000");

		// perdelivery plan 

		CeilingTotal.sendKeys("10000");
		CeilingOPEX.sendKeys("2000");
		CeilingCAPEX.sendKeys("400000");
		CeilingUnallocated.sendKeys("39444");

		// ceiling 
         
		RequestedforApprovalTotal.sendKeys("10000");
		RequestedforApprovalOPEX.sendKeys("200000");
		RequestedforApprovalCAPEX.sendKeys("30000");
		RequestedforApprovalUnallocated.sendKeys("30000");
		
		// requested for approval 
		
		ApprovedFromCeilingTotal.sendKeys("20000");
		ApprovedFromCeilingOPEX.sendKeys("30000");
		ApprovedFromCeilingCAPEX.sendKeys("40000");
		ApprovedFromCeilingUnallocated.sendKeys("3000");
		
		//approved from ceiling 
		
		ApprovedOutofCeilingTotal.sendKeys("10000");
		ApprovedOutofCeilingOPEX.sendKeys("20000");
		ApprovedOutofCeilingCAPEX.sendKeys("30000");
		ApprovedOutofCeilingUnallocated.sendKeys("4000");

       // approved out of ceiling
		
		SaveBtn.click();







	}





}


