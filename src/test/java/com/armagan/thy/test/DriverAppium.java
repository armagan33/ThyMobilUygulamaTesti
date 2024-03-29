package com.armagan.thy.test;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverAppium {
    protected static AndroidDriver appiumDriver;


    @BeforeScenario
    public void  beforeScenario() throws MalformedURLException {



        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType
                .PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType
                .DEVICE_NAME,"emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType
                .APP_PACKAGE,"com.turkishairlines.mobile");
        desiredCapabilities.setCapability(MobileCapabilityType
                .APP_ACTIVITY,"com.turkishairlines.mobile.ui.ACSplash");
        desiredCapabilities.setCapability(MobileCapabilityType
                .NEW_COMMAND_TIMEOUT,"3000");
        URL url= new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AndroidDriver(url,desiredCapabilities);




    }



    @AfterScenario
    public  void afterSenerio(){
        if(appiumDriver !=null){
            appiumDriver
                    .quit();
        }
    }
}