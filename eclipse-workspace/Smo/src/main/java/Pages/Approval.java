package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Approval extends PageBase {

	public Approval(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   
	// Cr Requiring Actions WebElements ,Methods 
	
		@ FindBy(id = "ChangeRequestsTableFilter" )
		WebElement SearchField ; 

		@ FindBy(id = "GetChangeRequestsButton" )
		WebElement Search; 

		@FindBy(id= "//*[@id=\"ExportToExcelButtonSST\"]")
		WebElement exporttoExcel ; 


		@FindBy(id= "aInitiator")
		WebElement aInitiator ; 

		@FindBy(id= "aAssessor")
		WebElement aAssessor ; 

		@FindBy(id= "aEndorser")
		WebElement aEndorser ; 

		@FindBy(id= "aFinalApproval")
		WebElement aFinalApproval ; 

		@FindBy(id= "ShowAdvancedFiltersSpan")
		WebElement ShowAdvancedFiltersSpan ; 

		@FindBy(xpath ="//*[@id=\"ChangeRequestsTable\"]/tbody/tr/td[2]/div/button" )
		WebElement actions  ; 

		@FindBy(xpath = "//*[@id=\"ChangeRequestsTable\"]/tbody/tr[1]/td[1]")
		WebElement plussign ; 

		@FindBy(xpath = "//*[@id=\"ChangeRequestsTable\"]/tbody/tr/td[2]/div/ul/li[1]/a")
	    WebElement view ; 
		
		@FindBy(xpath = "//*[@id=\"Btn-7\"]/span")
	    WebElement RecommendForapprovalBTN ; 
		
		@FindBy(xpath = "//*[@id=\"Btn-4\"]/span")
	    WebElement RejectBTN ; 
		
		@FindBy(xpath = "//*[@id=\"Btn-3\"]/span")
	    WebElement ReturnBTN ; 
		
		@FindBy(xpath = "//*[@id=\"btnDiscard\"]")
	    WebElement DiscardBTN ; 
		
		@FindBy(xpath = "//*[@id=\"Btn-6\"]/span")
	    WebElement ApproveforSubmissionBTN ; 
		
		@FindBy(id= "swal-input1")
	    WebElement EnterDecisionNumber ; 
		
		@FindBy(xpath = "//*[@id=\"notArabi\"]/div[6]/div/div[3]/button[1]")
	    WebElement ContinueBTN ; 
		
		@FindBy(xpath = "//*[@id=\"notArabi\"]/div[6]/div/div[3]/button[2]")
	    WebElement CancelBTN ; 
		
		@FindBy(xpath = "//*[@id=\"Btn-2\"]/span")
	    WebElement ApproveBTN ; 
		
		@FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[4]/nav/ul/li[2]/a/span/span")
	    WebElement CRrequiringActionsBTN ; 
		

		@FindBy(xpath = "//*[@id=\"notArabi\"]/div[6]/div/div[3]/div[2]/button")
		WebElement Yes;
		
		@FindBy(id = "DefaultFileUploadTextInput")
		WebElement FILENAME;
		
		@FindBy(id = "fileupload")
		WebElement selectFile;
		
		@FindBy(id = "comment")
		WebElement Commentsfield ;
		
		@FindBy(id = "Btn-CommentSaveAsDraft")
		WebElement 	BtnSaveAsDraft;
		
		@FindBy(id = "Btn-1")
		WebElement 	BtnSubmit;
		
		
		
		
	
		
		
		
		public void makingApprovalby_assessor (String CodeNumber) throws InterruptedException, AWTException
		{
		  	CRrequiringActionsBTN.click();
		  	aAssessor.click();
		  	SearchField.sendKeys(CodeNumber);
			Search.click();
			// Search for the Cr at the assessor tap 
			
			actions.click();
			view.click();			
			ApproveBTN.click();           
			Yes.click();
		}
			//  APPROVAL FROM THE ASSESSOR 
	
		public void makingApprovalby_Endorser (String CodeNumber) throws InterruptedException, AWTException
		{
			Thread.sleep(4000);
			aEndorser.click();
			SearchField.sendKeys(CodeNumber);
			Search.click();
			// Search for the Cr at the endorser tap 
			actions.click();
			view.click();	
			
			Thread.sleep(3000);
			FILENAME.sendKeys("TESTS");	
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
			
			//UPLOAD FILE 
			Thread.sleep(3000);
			ApproveforSubmissionBTN.click();
			Yes.click();
		}	
			//  APPROVAL FROM THE ENDORSER
		public void makingApprovalby_EndorserFinal (String CodeNumber) throws InterruptedException, AWTException
		{
			aEndorser.click();
			SearchField.sendKeys(CodeNumber);
			Search.click();
			// Search for the Cr at the endorser tap AGAIN TO HAVE THE SECOND APPROVAL 
			Thread.sleep(3000);
			actions.click();
			view.click();	
			RecommendForapprovalBTN.click();
			EnterDecisionNumber.sendKeys("12");
			ContinueBTN.click();
		}	
			// final approval from endorser
		
		public void makingApprovalby_FinalApproval (String CodeNumber) throws InterruptedException, AWTException
		{
			aFinalApproval.click();
			SearchField.sendKeys(CodeNumber);
			Search.click();
			// Search for the Cr at the final approval tap 
			Thread.sleep(3000);
			actions.click();
			view.click();	
			Commentsfield.sendKeys("karim");
			ApproveBTN.click();
			BtnSaveAsDraft.click();
			ApproveBTN.click();
			EnterDecisionNumber.sendKeys("12");
			ContinueBTN.click();
			
		}
	
}
