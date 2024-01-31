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

WebUI.click(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/i_January, 2024_fa fa-plus-square'))

WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Event_task'))

WebUI.waitForElementVisible(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Subject_subject'), 
    3)

WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Subject_subject'), subject)

WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Due on_date_selectedEndDate'), 
    dueDate)

WebUI.sendKeys(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Due on_date_selectedEndDate'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/body_Details Text'), details)

if (isAddTask) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Add task for others_addTaskToOthers'))

    if (!(isAddToCalendar)) {
        WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Do not add task on my calendar_addTaskToMe'))
    }
    
    WebUI.waitForElementVisible(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Select employees'), 
        3)

    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/input_Select employees'), 
        'emp')

    WebUI.waitForElementPresent(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/li_emp  05'), 
        0)

    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/li_emp  05', [('assignEmp') : assignEmp]))

    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/a_Save'))

    WebUI.verifyElementVisible(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/div_Task has been saved successfully'))
} else {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/a_Save'))

    WebUI.verifyElementVisible(findTestObject('TC04 - Dashboard/01 - Event/TC_015_AddNewTask/Page_Home page/div_Task has been saved successfully'))
}

