package sample

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

import org.apache.commons.lang.RandomStringUtils

public class Common {
	@Keyword
	def validloginsteps() {
		WebUI.verifyElementPresent(findTestObject('manual/home/makeAppointment_btn'), 0)
		
		WebUI.click(findTestObject('manual/home/makeAppointment_btn'))
		
		WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/input_Username_txt-username'), 0)
		
		WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/input_Password_txt-password'), 0)
		
		WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/button_Login'), 0)
		
		WebUI.setText(findTestObject('capture/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')
		
		WebUI.setText(findTestObject('capture/Page_CURA Healthcare Service/input_Password_txt-password'), 'ThisIsNotAPassword')
		
		WebUI.click(findTestObject('capture/Page_CURA Healthcare Service/button_Login'))
	}
	
	@Keyword
	def randomtext() {
		return RandomStringUtils.randomAlphabetic(30)
	}
}
