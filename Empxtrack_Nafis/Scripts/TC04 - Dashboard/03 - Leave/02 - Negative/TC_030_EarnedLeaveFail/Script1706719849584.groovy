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

WebUI.scrollToElement(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/i_Earned 3 Dots (1)'), 
    0)

WebUI.click(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/i_Earned 3 Dots (1)'))

WebUI.click(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/a_Apply Button (1)'))

WebUI.waitForElementVisible(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_Start Date (1)'), 
    2)

WebUI.setText(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_Start Date (1)'), 
    startDate)

WebUI.sendKeys(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_Start Date (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_End Date (1)'), Keys.chord(
        Keys.LEFT_CONTROL, 'a'))

WebUI.sendKeys(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_End Date (1)'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_End Date (1)'), endDate)

WebUI.sendKeys(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/input_End Date (1)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/textarea_Reason (1)'), reason)

WebUI.click(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/a_Apply Save_Btn (1)'))

WebUI.verifyElementVisible(findTestObject('TC04 - Dashboard/03 - Leave/TC_030_EarnedLeaveFail/Page_Home page/div_You can not create leave request (1)'))

