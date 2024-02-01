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

WebUI.click(findTestObject('TC06 - Menu Toolbar/TC_058_ClickCommunicateChat/Page_Home page/img_Communicate Button'))

WebUI.waitForElementVisible(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/a_Open Suggestion'), 
    3)

WebUI.click(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/a_Open Suggestion'))

WebUI.setText(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/input_Share a suggestion_empxtrack_feedback_subject_by_client'), 
    specifyArea)

WebUI.setText(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/textarea_Share a suggestion_empxtrack_feedback_by_client'), 
    suggestion)

WebUI.click(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/input_Check for anonymous submit_checkAnonymousSubmit'))

WebUI.click(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/a_Submit suggestion'))

WebUI.waitForElementVisible(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/div_Thanks for submitting your valuable suggestion'), 
    2)

WebUI.verifyElementVisible(findTestObject('TC06 - Menu Toolbar/TC_063_CommunicationSuggestion/Page_Home page/div_Thanks for submitting your valuable suggestion'))

