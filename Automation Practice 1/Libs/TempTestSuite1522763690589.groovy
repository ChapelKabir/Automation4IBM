import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Testing via Firefox')

suiteProperties.put('name', 'Testing via Firefox')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\mkabir\\Katalon Studio\\Automation Practice 1\\Reports\\Testing via Firefox\\20180403_145450\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Testing via Firefox', suiteProperties, [new TestCaseBinding('Test Cases/Verify a user can see previously added items in their shopping cart', 'Test Cases/Verify a user can see previously added items in their shopping cart',  null), new TestCaseBinding('Test Cases/Verify Browsing around the menus works without error', 'Test Cases/Verify Browsing around the menus works without error',  null), new TestCaseBinding('Test Cases/Verify it is possible to add items to the cart', 'Test Cases/Verify it is possible to add items to the cart',  null), new TestCaseBinding('Test Cases/Verify Sign in and Sing out works with valid user name and password', 'Test Cases/Verify Sign in and Sing out works with valid user name and password',  null), new TestCaseBinding('Test Cases/Verify Sign in fails with invalid or non existing user details', 'Test Cases/Verify Sign in fails with invalid or non existing user details',  null), new TestCaseBinding('Test Cases/Verify the test page opens and close with out any error', 'Test Cases/Verify the test page opens and close with out any error',  null)])
