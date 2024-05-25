package team04_AlloverCommerceTestNG.tests;

import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US06 {

    @Test
    public void US06_TC01() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


}
