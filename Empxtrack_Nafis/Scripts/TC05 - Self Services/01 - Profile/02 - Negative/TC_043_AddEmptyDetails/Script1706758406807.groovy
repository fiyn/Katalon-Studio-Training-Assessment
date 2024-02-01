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

WebUI.callTestCase(findTestCase('TC05 - Self Services/01 - Profile/01 - Positive/TC_041_ViewProfileFullPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_a_Open Hobbies'), 
    2)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_a_Open Hobbies'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/a_Add'), 
    2)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/a_Add'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/i_Your Hobbies  Interests_fa fa-save'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_043_AddEmptyDetails/Page_Home page/div_Please enter valid text'), 
    0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_043_AddEmptyDetails/Page_Home page/div_Please enter valid text'))

