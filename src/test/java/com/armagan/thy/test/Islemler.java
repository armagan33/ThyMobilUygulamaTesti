package com.armagan.thy.test;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;


public class Islemler extends DriverAppium {


    @Step({"<seconds> saniye bekle"})
    public void bekle(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Konum Paylasımi Onayla")
    public void konumOnay() {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.android.packageinstaller:id/permission_allow_button");
        el1.click();
    }

    @Step("Cerez Onayla")
    public void cerezOnay() {
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");
        el2.click();
    }

    @Step("buttona tıkla")
    public void btnBookin() {
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        el3.click();
    }

    @Step("Tek Yön Seç")
    public void oneWay() {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        el1.click();
    }

    @Step("<value>From seç")
    public void from(String value) {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
        el1.click();
        bekle(1);
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys(value);
        bekle(1);
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
        el3.click();
        bekle(2);
    }

    @Step("<value>To seç")
    public void to(String value) {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");
        el1.click();
        bekle(2);
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys(value);
        bekle(2);
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
        el3.click();
        bekle(1);
    }

    @Step("Kişi sayisi ayarla")
    public void kisiSayi() {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]");
        el1.click();
    }

    @Step("Tarih ayarla")
    public void tarih() {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        el1.click();
        bekle(1);
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        el2.click();
        bekle(1);
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el3.click();
    }

    public void checkPage(MobileElement element) {
        if(element == null){
            Assert.fail();
        }else{

        }

    }

    @Step("Uçuş ara")
    public void ucusAra() {
        bekle(5);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el1.click();
        bekle(10);
    }

    @Step("Uçuş seç")
    public void ucusSec() {
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementByXPath("(//*[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_rlRoot\"])[1]");
        bekle(1);
        checkPage(el2);
        bekle(1);
        el2.click();
        bekle(1);
    }

    @Step("ekonomik clas seç")
    public void ekonomikClass() {
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementByXPath("(//*[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"])[1]");
        el1.click();
        bekle(1);
    }

    @Step("Devam et")
    public void clickContinue() {
        bekle(1);
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el1.click();
        bekle(1);
    }


}
