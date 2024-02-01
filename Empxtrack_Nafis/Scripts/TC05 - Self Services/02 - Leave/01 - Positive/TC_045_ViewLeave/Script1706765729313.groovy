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

WebUI.callTestCase(findTestCase('TC01 - Login/01 - Positive/TC_001_Login'), [('urlAddress') : GlobalVariable.urlAddress, ('username') : GlobalVariable.username
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/div_Self services side bar'))

WebUI.scrollToElement(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/h3_Leave'), 0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/h3_Leave'))

WebUI.click(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/a_Leave transactions'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/div_Leave transactionsHelp'), 
    0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/02 - Leave/TC_045_ViewLeave/Page_Home page/div_Leave transactionsHelp'))
