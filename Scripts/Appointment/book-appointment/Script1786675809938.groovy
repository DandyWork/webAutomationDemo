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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('manual/home/makeAppointment_btn'), 0)

WebUI.click(findTestObject('manual/home/makeAppointment_btn'))

WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/input_Username_txt-username'), 0)

WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/input_Password_txt-password'), 0)

WebUI.verifyElementPresent(findTestObject('capture/Page_CURA Healthcare Service/button_Login'), 0)

WebUI.setText(findTestObject('capture/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')

WebUI.setText(findTestObject('capture/Page_CURA Healthcare Service/input_Password_txt-password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('capture/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.click(findTestObject('manual/appointment/facility_field'))

WebUI.click(findTestObject('manual/appointment/seoul_dropdown'))

WebUI.click(findTestObject('manual/appointment/readmission_checkbox'))

WebUI.click(findTestObject('manual/appointment/medicaid_option'))

WebUI.setText(findTestObject('manual/appointment/date_field'), '13/08/2026')

WebUI.setText(findTestObject('manual/appointment/comment_field'), 'ytta')

WebUI.click(findTestObject('manual/appointment/book_btn'))

WebUI.verifyElementPresent(findTestObject('manual/appointment/bookconfirm_txt'), 0)

WebUI.verifyElementPresent(findTestObject('manual/appointment/gotohomepage_txt'), 0)

WebUI.closeBrowser()

