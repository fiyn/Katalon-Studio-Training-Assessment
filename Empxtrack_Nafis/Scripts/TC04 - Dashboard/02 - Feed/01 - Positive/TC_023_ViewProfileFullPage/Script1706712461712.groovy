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

WebUI.callTestCase(findTestCase('TC04 - Dashboard/02 - Feed/01 - Positive/TC_022_ViewProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC04 - Dashboard/02 - Feed/TC_023_ViewProfileFullPage/Page_Home page/a_View in full page'))

WebUI.waitForElementVisible(findTestObject('TC04 - Dashboard/02 - Feed/TC_023_ViewProfileFullPage/Page_Home page/dispcontentlargefontname_emp 10'), 
    2)

WebUI.verifyElementVisible(findTestObject('TC04 - Dashboard/02 - Feed/TC_023_ViewProfileFullPage/Page_Home page/dispcontentlargefontname_emp 10'))

