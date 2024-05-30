package team04_AlloverCommerceTestNG.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider(name = "positiveTestData")
    public static Object[][] provideBoundaryValueTestData() {
        return new Object[][] {
                { "18" },    // Alt sınır
                { "30" },  // Geçerli yaş
                { "100" },   // Üst sınır
        };
    }

    @DataProvider(name = "negativeTestData")
    public static Object[][] provideNegativeTestData() {
        return new Object[][] {
                { "17" },   // Alt sınırın altı
                { "101" }   // Üst sınırın üstü
        };
    }

    @DataProvider(name = "vendorRegisterNegativeMailData")
    public static Object[][] NegativeMailData() {
        return new Object[][] {
                { "Mustafa.gmail.com" },
                { "Mustafa@gmail." },
                { "Mustafa@.com" },
                { "@gmail.com" }

        };
    }
}