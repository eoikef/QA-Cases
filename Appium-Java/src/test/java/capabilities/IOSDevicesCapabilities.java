package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum IOSDevicesCapabilities {

    IPHONE("src/test/java/capabilities/devices/IphoneDevice.json");

    private String path;

    IOSDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getIOSCapabilitiesFromEnvironment() {

        DesiredCapabilities iOSCapabilities = LoadCapabilities.pathToDesiredCapabilitites(this.path);

        return iOSCapabilities;


    }

}
