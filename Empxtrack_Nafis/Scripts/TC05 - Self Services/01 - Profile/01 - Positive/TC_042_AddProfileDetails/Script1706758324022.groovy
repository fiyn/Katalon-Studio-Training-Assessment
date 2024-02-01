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

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_a_Open Hobbies'))

not_run: WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobies_a_Add'), 
    0)

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobies_a_Add'))

not_run: WebUI.setText(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_input_Your Hobbies'), 
    hobby)

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_i_Save Hobbies Button'))

not_run: WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_div_Hobies save confirmation'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_div_Hobies save confirmation'))

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_button_Hobbies Ok'))

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_span_Close'))

not_run: WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Hobbies/Hobbies_a_Open Hobbies'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Languages Open'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Lang Add'), 
    2)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Lang Add'))

not_run: WebUI.selectOptionByLabel(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/select_Lang Details'), 
    langDetails, false)

not_run: WebUI.selectOptionByLabel(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/select_Lang Proficiency'), 
    langProficiency, false)

WebUI.setText(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/textarea_Lang More details'), 
    langMoreDetails)

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/a_Save Lang'))

WebUI.waitForElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/div_Record has been added successfully'), 
    0)

WebUI.verifyElementVisible(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/div_Record has been added successfully'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/button_Ok'))

WebUI.click(findTestObject('TC05 - Self Services/01 - Profile/TC_042_AddProfileDetails/Page_Home page/Languages/span_Close'))

