import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandStr

'Random 4 angka'
randomNumeric = RandStr.randomNumeric(8)

randomNumericEmail = RandStr.randomNumeric(5)

randomTwo = RandStr.randomNumeric(2)

randomOrganization = (organization + randomTwo)

randomFullName = (fullname + randomTwo)

randomEmail = ((email + randomNumericEmail) + domain)

randomPhoneNumber = (phonenumber + randomNumeric)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Dashboard/Button/Button_Login_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Dashboard/Button/Button_Registrasi'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Label/label_contact_us'), label_contact_us)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Label/label_organization'), label_organization)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Label/label_full_name'), label_full_name)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Label/label_email'), label_email)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Label/label_phone_number'), label_phone_number)

WebUI.setText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_text_organization'), randomOrganization)

WebUI.setText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_text_full_name'), randomFullName)

WebUI.setText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_text_your_email'), randomEmail)

WebUI.setText(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_text_your_phone_number'), randomPhoneNumber)

WebUI.delay(2)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_submit'))

WebUI.waitForPageLoad(10)

WebUI.delay(4)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Registrasi/Button/button_back_to_home'))

WebUI.delay(4)

return randomOrganization

