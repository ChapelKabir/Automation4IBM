import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('IBM TEST/Page_My Store (3)/a_Sign in'))

WebUI.setText(findTestObject('IBM TEST/Page_Login - My Store (1)/input_email'), 'chapel.kabir@yahoo.com')

WebUI.setText(findTestObject('IBM TEST/Page_Login - My Store (1)/input_passwd'), 'LaraSara26')

WebUI.click(findTestObject('IBM TEST/Page_Women - My Store/a_Women'))

WebUI.click(findTestObject('IBM TEST/Page_Women - My Store/img_replace-2x'))

WebUI.click(findTestObject('IBM TEST/Page_Dresses - My Store (1)/html_Dresses - My Store  var C'))

WebUI.click(findTestObject('IBM TEST/Page_Dresses - My Store (1)/img_replace-2x img-responsive'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/span_Continue shopping'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/a_Blue'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/span_Continue shopping'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor (1)/a_T-shirts'))

WebUI.click(findTestObject('IBM TEST/Page_T-shirts - My Store/html_T-shirts - My Store  var'))

WebUI.click(findTestObject('IBM TEST/Page_T-shirts - My Store/a_color_2'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts - (1)/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts - (1)/span_cross'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts - (1)/a_Sign out'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts - (1)/a_Sign in'))

WebUI.setText(findTestObject('IBM TEST/Page_Login - My Store (1)/input_email'), 'chapel.kabir@yahoo.com')

WebUI.setText(findTestObject('IBM TEST/Page_Login - My Store (1)/input_passwd'), 'LaraSara26')

WebUI.click(findTestObject('IBM TEST/Page_Login - My Store (1)/span_Sign in'))

WebUI.acceptAlert()

WebUI.closeBrowser()

