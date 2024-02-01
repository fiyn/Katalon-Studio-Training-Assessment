package addNewTicket

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class HandleTicket {
	/**
	 * Set Ticket Type
	 */
	@Keyword (keywordObject = "Decide Ticket Type")
	def setTicketType(String ticket) {
		String ticketTypeIs = ""

		switch (ticket) {
			case "1":
				ticketTypeIs = "Resource Request";
				break;
			case "2":
				ticketTypeIs = "Request For Information";
				break;
			case "3":
				ticketTypeIs = "Grievance";
				break;
			case "4":
				ticketTypeIs = "Complaint";
				break;
			case "5":
				ticketTypeIs = "Suggestion";
				break;
			case "6":
				ticketTypeIs = "Notification";
				break;
			default:
				ticketTypeIs = "Request For Information"
				break;
		}

		println(ticketTypeIs)
		return ticketTypeIs
	}
	
	/**
	 * Set Category
	 */
	@Keyword (keywordObject = "Set Category")
	def setCategory(String category) {
		String categoryIs = ""
				
				switch (category) {
				case "1":
					categoryIs = "Computer Hardware";
					break;
				case "2":
					categoryIs = "Books And Study Material";
					break;
				default:
					categoryIs = "Computer Hardware"
					break;
				}
		
		println(categoryIs)
		return categoryIs
	}
	
	
	/**
	 * Set Priority
	 */
	@Keyword (keywordObject = "Set Priority")
	def setPriority(String priority) {
		String priorityIs = ""
				
				switch (priority) {
				case "1":
					priorityIs = "1 very low";
					break;
				case "2":
					priorityIs = "2 low";
					break;
				case "3":
					priorityIs = "3 normal";
					break;
				case "4":
					priorityIs = "4 high";
					break;
				case "5":
					priorityIs = "5 very high";
					break;
				default:
					priorityIs = "1 very low"
					break;
				}
		
		println(priorityIs)
		return priorityIs
	}
	
	
}
