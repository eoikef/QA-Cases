package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum AndroidDevicesCapabilities {


    ANDROID("src/test/java/capabilities/devices/AndroidDevice.json");



    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromEnvironment() {
        DesiredCapabilities androidCapabilities = LoadCapabilities.pathToDesiredCapabilitites(this.path);

        return androidCapabilities;

    }

}