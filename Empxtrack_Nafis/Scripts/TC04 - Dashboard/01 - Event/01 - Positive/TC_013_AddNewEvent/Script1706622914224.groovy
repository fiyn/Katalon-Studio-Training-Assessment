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

WebUI.setText(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/input_Subject_subject'), subject)

if (!(isMultiDayEvent)) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Multi-day Checkbox'))
}

WebUI.setText(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/input_Location_location'), location)

if (isPrivate) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Private  Checkbox'))
}

if (!(isAddToCalendar)) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Add this event on my calendar also  Checkbox'))
}

if (!(isMultiDayEvent)) {
    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start date_date_selectedStartDate', [
                ('startDate') : startDate]), startDate)

    WebUI.sendKeys(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start date_date_selectedStartDate', 
            [('startDate') : startDate]), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start time_startTime', [('startTime') : startTime]), 
        startTime)

    WebUI.selectOptionByValue(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/select_AMPM'), 
        startTimeHour, true)

    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_End Date'), endDate)

    WebUI.sendKeys(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_End Date'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_End Time'), endTime)

    WebUI.selectOptionByValue(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/select_AMPM End Time'), endHour, 
        true)

    setTimezone = CustomKeywords.'addNewEvent.TimezoneHandler.setTimezone'(timezone)

    WebUI.selectOptionByValue(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/select_Time Zone Multi-day Event'), 
        setTimezone, true)
} else {
    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start date_date_selectedStartDate', [
                ('startDate') : startDate]), startDate)

    WebUI.sendKeys(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start date_date_selectedStartDate', 
            [('startDate') : startDate]), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Start time_startTime', [('startTime') : startTime]), 
        startTime)

    WebUI.selectOptionByValue(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/select_AMPM'), 
        startTimeHour, true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/select_---Select---15 Minutes30 Minutes45 M_45c030'), 
        duration, true)

    setTimezone = CustomKeywords.'addNewEvent.TimezoneHandler.setTimezone'(timezone)

    WebUI.selectOptionByValue(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/select_---Select---(GMT-0800) Pacific Time _e0ab6b'), 
        setTimezone, true)
}

if (isAllDayEvent) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_All day event Checkbox'))
}

if (isRepeat) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Repeat Checkbox'))

    frequency.toUpperCase()

    println(frequency)

    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Daily_frequency Radio Button', [('frequency') : frequency]))

    WebUI.selectOptionByValue(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/select_Repetition Daily'), repitition, 
        false)

    if (frequency == 'DAILY') {
        if (isExcludeWknd) {
            WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Exclude weekends Checkbox (For Daily)'))
        }
    }
}

if (!(isSendToEmpMail)) {
    WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/input_Send calendar invite in email_sendNotification'))
}

WebUI.setText(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/input_Select employees_chosen-search-input _11a096'), 
    'emp')

WebUI.waitForElementPresent(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/li_emp 08'), 0)

WebUI.click(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/li_emp 08', [('employeeName') : employeeName]))

WebUI.click(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/a_Next'))

WebUI.setText(findTestObject('TC04 - Dashboard/01 - Event/Page_Home page/body_Agenda Textbox'), agendaText)

WebUI.click(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/a_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC04 - Dashboard/01 - Event/Page_Home page/div_Event invitation has been added successfully'))

