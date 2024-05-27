package team04_AlloverCommerceTestNG.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {
      static Faker faker = new Faker();

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

    @DataProvider(name = "invalidTestData")
    public static Object[][] provideinvalidTestData() {
        return new Object[][] {
                { "ali" },   // invalidTestData
                { "?" },
                { "-5" }
        };
    }

    @DataProvider(name = "LoginData")
    public static Object[][] provideLoginTestData() {
        return new Object[][] {
                { "veli43456@"},
                { "Ali12345_" },
                { "Ali12345-"} ,


               /* { ""}         ,
                { "Ali12345?"} ,
                {" ".repeat(8)},  */



              // { "Ali1234@", faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
              // { "Ali1234@", faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
              // { "Ali1234@", faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
              // { "Ali1234@", faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
              // { "Ali1234@", faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
              //
              //





                {Keys.SPACE,faker.internet().emailAddress(),faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},

        };
    }










}