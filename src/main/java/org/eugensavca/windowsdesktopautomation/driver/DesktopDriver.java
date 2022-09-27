package org.eugensavca.windowsdesktopautomation.driver;

import io.appium.java_client.windows.WindowsDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Service
public class DesktopDriver {

    private WindowsDriver windowsDriver;

    @SneakyThrows(MalformedURLException.class)
    public DesktopDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("platformName","Windows");
        capabilities.setCapability("deviceName", "WindowsPC");
        windowsDriver = new WindowsDriver(new URL("http://192.168.1.79:4723"), capabilities);
        windowsDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @PreDestroy
    public void cleanApp() {
        windowsDriver.quit();
    }

}
