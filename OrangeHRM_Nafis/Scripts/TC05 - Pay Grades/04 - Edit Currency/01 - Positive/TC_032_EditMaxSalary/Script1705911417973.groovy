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

WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='
        , ('urlAddress') : GlobalVariable.urlAddress], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC05 - Pay Grades/03 - Delete Currency/TC_029_DeleteACurrency/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/li_Pay Grades'))

WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/button_Edit Action', 
        [('payGradeName') : payGradeName]))

WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/button_Edit Currency'))

WebUI.sendKeys(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_032_EditMaxSalary/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a'))

WebUI.sendKeys(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_032_EditMaxSalary/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_032_EditMaxSalary/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'))

WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/div_Edit CurrencyCurrencyMinimum SalaryMaxi_b0c072'))

WebUI.setText(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_032_EditMaxSalary/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'), 
    maximumSalary)

WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/div_SuccessSuccessfully Updated'))

