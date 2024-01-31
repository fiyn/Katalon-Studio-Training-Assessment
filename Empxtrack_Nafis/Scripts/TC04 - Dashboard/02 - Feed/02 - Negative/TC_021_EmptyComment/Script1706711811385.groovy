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

WebUI.callTestCase(findTestCase('TC01 - Login/01 - Positive/TC_001_Login'), [('urlAddress') : GlobalVariable.urlAddress, ('username') : 'empxt.latihan01@yopmail.com'
        , ('password') : 'cIjZX7FQSD5JPNYeXpMicQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('TC04 - Dashboard/02 - Feed/TC_017_AddComment/Page_Home page/input_Say hello to emp 10 on joining  as Default__reponse_note_1000012'), 
    comment)

WebUI.click(findTestObject('TC04 - Dashboard/02 - Feed/TC_017_AddComment/Page_Home page/i_Say hello to emp 10 on joining  as Default_fa fa-paper-plane'))

WebUI.verifyElementVisible(findTestObject('TC04 - Dashboard/02 - Feed/TC_021_EmptyComment/Page_Home page/div_Please enter the comment'))

