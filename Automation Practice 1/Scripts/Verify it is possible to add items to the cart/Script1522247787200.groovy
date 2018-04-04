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

WebUI.click(findTestObject('IBM TEST/Page_My Store (2)/img_replace-2x img-responsive'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts -/a_Orange'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts -/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts -/span_cross'))

WebUI.click(findTestObject('IBM TEST/Page_Faded Short Sleeve T-shirts -/a_Dresses'))

WebUI.click(findTestObject('IBM TEST/Page_Dresses - My Store/html_Dresses - My Store  var C'))

WebUI.click(findTestObject('IBM TEST/Page_Dresses - My Store/img_replace-2x img-responsive'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/a_Blue'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/span_cross'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/a_Yellow'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/a_Orange'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/a_Yellow'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/span_Add to cart'))

WebUI.click(findTestObject('IBM TEST/Page_Printed Summer Dress - My Stor/span_cross'))

WebUI.closeBrowser()

