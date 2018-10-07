package AlertsPage;

import common.Base;

public class Alerts extends Base{
    public void showActionSheetSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]");
    }
    public void showActionSheetOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]");
    }
    public void showActionSheetCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]");
    }
    public void showAlertSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]\n");
    }
    public void showAlertOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[2]");
    }
    public void showAlertCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Custom\"]");
    }
    public void showSecureTextInput(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]");
    }
}
