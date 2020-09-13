package com.webDriver.factory;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
	
	public static Capabilities capabilities;
	 
    public static Capabilities getCapabilities (String browser) {
        if (browser.equals("ie"))
            capabilities = OptionsManager.getIEOptions();
        else
            capabilities = OptionsManager.getChromeOptions();
        return capabilities;


}

}

    
    
