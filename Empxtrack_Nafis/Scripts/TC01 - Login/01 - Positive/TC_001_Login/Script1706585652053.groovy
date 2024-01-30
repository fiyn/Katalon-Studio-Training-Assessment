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

WebUI.openBrowser('')

WebUI.navigateToUrl(urlAddress)

WebUI.setText(findTestObject('Object Repository/TC01 - Login/Page_Empxtrack logon/input_If checked, login details will not be_5dd927'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/TC01 - Login/Page_Empxtrack logon/input_If checked, login details will not be_5c5f06'), 
    password)

WebUI.click(findTestObject('Object Repository/TC01 - Login/Page_Empxtrack logon/input_If checked, login details will not be_b1d379'))

WebUI.click(findTestObject('Object Repository/TC01 - Login/Page_Empxtrack logon/input_submit'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('TC01 - Login/Page_Home page/span_Close Pop-up'), 0)

WebUI.click(findTestObject('TC01 - Login/Page_Home page/span_Close Pop-up'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC01 - Login/Page_Home page/div_Good morningemp,'))

