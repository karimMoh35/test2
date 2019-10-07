package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import okhttp3.OkHttpClient;


public class Create_NewCR extends PageBase{

	public Create_NewCR(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//*[@id=\"CreateNewChangeRequestButton\"]/i")
	WebElement Create_NewCR;

	@FindBy(id = "select2-ddlTopics-container")
	WebElement ChangeRequestTopic_FieldName;

	@FindBy(xpath = "//*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement Topic_FieldName_Search;
	// Change Request Topic 

	@FindBy(id = "select2-ddlCategories-container")
	WebElement ChangeRequestCategory_FieldName;

	@FindBy(xpath ="//*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement CRCategoryFieldSearch;
	//ChangeRequestCategory

	@FindBy(id = "select2-ddlTypes-container")
	WebElement ChangeRequestType_FieldName;

	@FindBy(xpath ="//*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement CRType_FieldSearch;
	// ChangeRequestType

	@FindBy(id = "ChangeRequest_Description")
	WebElement ChangeRequest_Description;

	@FindBy(id = "ChangeRequest_Rationale")
	WebElement ChangeRequest_Rationale;

	@FindBy(id = "ChangeRequest_Implications")
	WebElement ChangeRequest_Implications;

	@FindBy(id = "btnWizardSaveNext")
	WebElement btnWizardSaveNext;

	@FindBy(id = "btnWizardBack")
	WebElement btnWizardBack;

	@FindBy(id = "btnWizardDiscard")
	WebElement btnWizardDiscard;

	@FindBy(id = "ChangeRequest_ImplicationsIfRejected")
	WebElement ChangeRequest_ImplicationsIfRejected;

	@FindBy(id = "CkIsJobCreation")
	WebElement CkIsJobCreation;

	@FindBy(id = "txtIsJobCreation")
	WebElement txtIsJobCreation;

	@FindBy(id = "CkIsOilRevenues")
	WebElement CkIsOilRevenues;

	@FindBy(id = "txtIsOilRevenues")
	WebElement txtIsOilRevenues;

	@FindBy(id = "	ckIsPrivateSectors")
	WebElement 	ckIsPrivateSector;

	@FindBy(id = "select2-ProgramId-container")
	WebElement 	selectProgramIdcontainer;                       // add VRP

	@FindBy(xpath = "	//*[@id=\"notArabi\"]/span/span/span[1]/input")
	WebElement 	VRPSearchField;

	@FindBy(id = "NewDescriptoinEn")
	WebElement 	NewDescriptoinEn; 

	@FindBy(id = "NewDescriptionAr")
	WebElement 	NewDescriptionAr; 

	@FindBy(id = "DefaultFileUploadTextInput")
	WebElement 	DefaultFileUploadTextInput;              // Documents Description 

	@FindBy(id = "fileupload")
	WebElement 	SelectBTN;  

	@FindBy(id = "comment")
	WebElement 	commentTXT;

	@FindBy(id = "Btn-CommentSaveAsDraft")
	WebElement 	BtnSaveAsDraft;

	@FindBy(xpath = "//*[@id=\"Btn-1\"]/span")
	WebElement 	SubmitBtn;

	@FindBy(xpath = "//*[@id=\"notArabi\"]/div[6]/div/div[3]/div[2]/button")
	WebElement Yes;

	@FindBy(id = "btnBackToStep")
	WebElement 	BackBtn;

	// create CR (VRP programCard - Description-Revise ProgramDescription)
	public void userCreate_NEW_CR () throws InterruptedException, AWTException
	{

		Create_NewCR.click();
		Thread.sleep(20000);
		ChangeRequestTopic_FieldName.click();
		Topic_FieldName_Search.sendKeys("VRP Program Card");
		Topic_FieldName_Search.sendKeys(Keys.ENTER);

		Thread.sleep(8000);

		ChangeRequestCategory_FieldName.click();
		CRCategoryFieldSearch.sendKeys("Description");
		CRCategoryFieldSearch.sendKeys(Keys.ENTER);

		Thread.sleep(8000);

		ChangeRequestType_FieldName.click();
		CRType_FieldSearch.sendKeys("Revise program description");
		CRType_FieldSearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		ChangeRequest_Description.sendKeys("testbykarim1");
		ChangeRequest_Rationale.sendKeys("testbykarim2");
		ChangeRequest_Implications.sendKeys("testbykarim3");
		ChangeRequest_ImplicationsIfRejected.sendKeys("testbykarim3e");

		CkIsJobCreation.click();
		txtIsJobCreation.sendKeys("3000");

		CkIsOilRevenues.click();
		txtIsOilRevenues.sendKeys("4000");

		btnWizardSaveNext.click();
		// first Page of CR (Change Request Information)

		Thread.sleep(3000);
		selectProgramIdcontainer.click();
		VRPSearchField.sendKeys("P 200");
		VRPSearchField.sendKeys(Keys.ENTER);               //  select PROG

		NewDescriptoinEn.sendKeys("testedBykarim" );
		NewDescriptionAr.sendKeys("test");

		btnWizardSaveNext.click();

		// second page(VRP Program Card-Description-Revise Program Description)

		Thread.sleep(3000);
		DefaultFileUploadTextInput.sendKeys("test");	
		String fileName ="task 1.xlsx";
		String filePath = System.getProperty("user.dir") + "/Upload/" + fileName;

		Robot robot = new Robot();

		//MAKE COPY for the file path and put it in the search 
		StringSelection selection = new StringSelection(filePath);
		Clipboard clipboard =Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);




		// make paste to the path of the menu 

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);

		robot.keyPress(KeyEvent.VK_ENTER);         //   press on Open BTN 
		robot.keyRelease(KeyEvent.VK_ENTER);

		btnWizardSaveNext.click();



		//	driver.findElement(By.id("fileupload")).sendKeys(filePath);
		//  driver.findElement(By.id("fileupload")).click();



		// third page (Documents)

		commentTXT.sendKeys("test");
		BtnSaveAsDraft.click();
		Thread.sleep(3000);
		SubmitBtn.click();
		Yes.click();




	}

}
