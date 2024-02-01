import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC05 - Self Services/04 - Tickets/01 - Positive/TC_052_ViewMyTicketFullPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/a_Create ticket'))

ticketTypeIs = CustomKeywords.'addNewTicket.HandleTicket.setTicketType'(ticketType)

if (ticketType == '1') {
    WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/span_Select to open Drop down'))

    WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Input to search type'), 
        ticketTypeIs)

    WebUI.sendKeys(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Input to search type'), 
        Keys.chord(Keys.ENTER))

    categoryIs = CustomKeywords.'addNewTicket.HandleTicket.setCategory'(category)

    WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/span_Category click to open'))

    WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Category search'), 
        categoryIs)

    WebUI.sendKeys(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Category search'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/span_Priority Click to open'))

    priorityIs = CustomKeywords.'addNewTicket.HandleTicket.setPriority'(priority)

    WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Priority search'), 
        priorityIs)

    WebUI.sendKeys(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Priority search'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Expected date_date_expectedDate'), 
        expectedDate)

    WebUI.sendKeys(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Expected date_date_expectedDate'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/span_Select to open Drop down'))

    WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Input to search type'), 
        ticketTypeIs)

    WebUI.sendKeys(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Input to search type'), 
        Keys.chord(Keys.ENTER))
}

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Subject'), 
    2)

WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Subject'), subject)

WebUI.setText(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/body_Description Textarea'), 
    description)

WebUI.uploadFile(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/input_Attach a document_uploadFile'), 
    document)

WebUI.click(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/a_Submit'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/div_Request has been submitted successfully'), 
    5)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/04 - Tickets/TC_053_CreateTicket/Page_Home page/div_Request has been submitted successfully'))

