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

WebUI.setText(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/input_Your Hobbies  Interests_hobbies0'), 
    hobby)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/i_Your Hobbies  Interests_fa fa-save'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/div_Record has been added successfully'), 
    0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/div_Record has been added successfully'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/button_Ok'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Page_Home page/span_'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Languages Open'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Lang Add'), 
    2)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Lang Add'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/Page_Home page/select_Lang Details Click to open'), 
    3)

WebUI.selectOptionByLabel(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/Page_Home page/select_Lang Details Click to open'), 
    langDetails, false)

WebUI.selectOptionByLabel(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/Page_Home page/select_Lang Proficiency click to open'), 
    langProficiency, false)

WebUI.setText(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/Page_Home page/textarea_More details'), 
    langMoreDetails)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Save Lang'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/div_Record has been added successfully'), 
    0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/div_Record has been added successfully'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/button_Ok'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/Page_Home page/span_close pop up'))

WebUI.scrollToElement(findTestObject('TC05 - Self Services/01 - Profile/TC_041_ViewProfileFullPage/Page_Home page/dispcontentlargefontname_Full View Mr.emp 01'), 
    2)

