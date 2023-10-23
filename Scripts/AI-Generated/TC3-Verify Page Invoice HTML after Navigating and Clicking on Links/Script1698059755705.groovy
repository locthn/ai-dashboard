import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page index2 html'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/index2.html')

'step 2: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page index2 html click on div highcharts 8qxikzm 0'

testObj = findTestObject('Object Repository/Page_home/div_highcharts_8qxikzm_0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page index2 html click on hyperlink javascript'

testObj = findTestObject('Object Repository/Page_home/hyperlink_javascript_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page index2 html click on hyperlink javascript --> navigate to Page invoice html'

testObj = findTestObject('Object Repository/Page_home/hyperlink_javascript_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page invoice html click on hyperlink invoice html'

testObj = findTestObject('Object Repository/Page_invoice_html/hyperlink_invoice_html')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/invoice.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page invoice html click on hyperlink invoice html'

testObj = findTestObject('Object Repository/Page_invoice_html/hyperlink_invoice_html')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/invoice.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page invoice html click on hyperlink javascript'

testObj = findTestObject('Object Repository/Page_invoice_html/hyperlink_javascript')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/invoice.html(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: Add visual checkpoint at Page invoice html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Page Invoice HTML after Navigating and Clicking on Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
