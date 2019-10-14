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

randomOrganization = WebUI.callTestCase(findTestCase('Registration'), [('label_contact_us') : 'Contact Us', ('label_organization') : 'Organization'
        , ('label_full_name') : 'Full Name', ('label_email') : 'Email', ('label_phone_number') : 'Phone Number', ('organization') : 'Testing1'
        , ('fullname') : 'Muhammad Nur', ('email') : 'nur_muhammad', ('domain') : '@yahoo.com', ('phonenumber') : '081'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Dashboard/Button/Button_Login_Dashboard'))

WebUI.delay(2)

WebUI.setText(findTestObject('Demo Aplikasi Paket ID/Login/Button/button_organization_name'), randomOrganization)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Login/Label/label_sign'), label_sign)

WebUI.verifyElementText(findTestObject('Demo Aplikasi Paket ID/Login/Label/label_organization_name'), label_organization_name)

WebUI.click(findTestObject('Demo Aplikasi Paket ID/Login/Button/button_continue'))

WebUI.delay(4)

