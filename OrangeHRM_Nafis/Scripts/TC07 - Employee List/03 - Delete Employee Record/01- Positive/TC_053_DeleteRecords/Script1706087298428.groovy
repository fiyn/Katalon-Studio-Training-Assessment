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

WebUI.click(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/a_PIM'))

not_run: boolean isEmployeeExist = false

not_run: println(isEmployeeExist)

not_run: isEmployeeExist = WebUI.verifyElementVisible(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/label_Checkbox Employee'))

not_run: while (!(isEmployeeExist)) {
    println(isEmployeeExist)

    if (!(isEmployeeExist)) {
        WebUI.scrollToPosition(9999999, 9999999)

        WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/button_Next Page'))

        isEmployeeExist = WebUI.verifyElementVisible(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/label_Checkbox Employee'))
    }
}

deleteName = CustomKeywords.'employeeList.GetFirstMidName.concatName'(empFirstName, empMidName, isMidName)

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/label_Checkbox Employee', 
        [('deleteName') : deleteName]))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/label_Checkbox Employee 1', 
        [('empFirstName1') : empFirstName1]))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/label_Checkbox Employee 2', 
        [('empFirstName2') : empFirstName2]))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/label_Checkbox Employee 3', 
        [('empFirstName3') : empFirstName3]))

WebUI.scrollToPosition(0, 2)

WebUI.delay(2)

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_053_DeleteRecords/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementVisible(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

