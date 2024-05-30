package team04_AlloverCommerceTestNG.utilities;
import com.github.javafaker.Faker;
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

    @DataProvider(name = "vendorRegisterNegativeMailData")
    public static Object[][] NegativeMailData() {
        return new Object[][] {
                { "Mustafa.gmail.com" },
                { "Mustafa@gmail." },
                { "Mustafa@.com" },
                { "@gmail.com" }

        };
    }

    @DataProvider(name = "UserNameDataPositiveTest")
    public static Object[][] provideUserNamePositiveTestData() {
        return new Object[][]{

                {faker.name().username() + "@", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.name().username() + "_", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.name().username() + "-", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.name().username() + ".", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.regexify("[A-Za-z0-9]{59}"), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.regexify("[A-Za-z0-9]{60}"), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
        };
    }

    @DataProvider(name = "UserNameDataNegativeTest")
    public static Object[][] provideUserNameTestData() {
        return new Object[][]{

                {faker.name().username() + "/", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {" ".repeat(8), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {"", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {faker.regexify("[A-Za-z0-9]{61}"), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
        };
    }

    @DataProvider(name = "AcceptEmailData")
    public static Object[][] provideAceptEmailTestData() {
        return new Object[][]{
                {sanitizeUsername(faker.name().username()), faker.name() + "gm.aml.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//"@gm.aml.com"
                {sanitizeUsername(faker.name().username()), faker.name() + "gm-ail.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//@gm-ail.com"
                {sanitizeUsername(faker.name().username()), "aligel@" + faker.regexify("[aseHG58]{9}")+".com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), "aligel@" + faker.regexify("[aer456G]{9}")+".com"+faker.regexify("[aer456Grty]{6}"), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), "A.bu|_zer-Gel" + faker.name()+".com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//"A.bu|_zer-Gel@"
                // {sanitizeUsername(faker.name().username()), faker.name() + "..gel@gmail.63", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//"..gel@gmail.63"
                {sanitizeUsername(faker.name().username()), "aligel@" + faker.regexify("[0-9]{9}")+".com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), "/" + faker.name() + "gmail.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//"@gmail.com"
                {sanitizeUsername(faker.name().username()), "_aligel." + faker.name() + ".com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},//"_aligel.@"


        };
    }

    @DataProvider(name = "InAcceptEmailData")
    public static Object[][] provideInAcceptEmailTestData() {
        return new Object[][]{

                {sanitizeUsername(faker.name().username()), "", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), "üzlemgel@bhh.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " @gmail.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@@mail.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@mail?.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@gm ail.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@ali.", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@.ali.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@a_li.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@a..li.com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel" + "@" + "aliAWE8".repeat(9) + "r" + ".com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@ali .com", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " /%$§&/54@1_$%&2/*;.com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@gm-.al.com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@-gmal.com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@_gmal.com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@.com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@com ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
                {sanitizeUsername(faker.name().username()), " aligel@gmailcom ", faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")},
        };
    }

    public static String sanitizeUsername(String username) {
        return username.replaceAll("[^a-zA-Z0-9@\\-_]", "");
    }//*

    public static String sanitizeEmail(String email, String username) {
        if (email.isEmpty()) {
            email = username + "@gmail.com";
        }
        return email.replaceAll("ç", "c")
                .replaceAll("ğ", "g")
                .replaceAll("ı", "i")
                .replaceAll("ö", "o")
                .replaceAll("ş", "s")
                .replaceAll("ü", "u")
                .replaceAll("Ç", "C")
                .replaceAll("Ğ", "G")
                .replaceAll("İ", "I")
                .replaceAll("Ö", "O")
                .replaceAll("Ş", "S")
                .replaceAll("Ü", "U");
    }

    @DataProvider(name = "PassWordNegativeData")
    public static Object[][] providePassWordNegativeTestData() {
        return new Object[][]{
                //Password alanına 7 karakterden olusan bir sifre gir
                {sanitizeUsername(faker.name().username()),faker.internet().emailAddress(),"Test13?" },
                //Password alanına special karakter kullanılmadan bir şifre gir
                {sanitizeUsername(faker.name().username()), faker.internet().emailAddress()," Test135ALLover"},
                // Password alanına rakam kullanılmadan bir şifre gir
                {sanitizeUsername(faker.name().username()), faker.internet().emailAddress(),"Test?!&ALLover" },
                //Password alanına buyuk harf kullanılmadan bir şifre gir
                {sanitizeUsername(faker.name().username()),faker.internet().emailAddress() ,"test135allover?!&" },
                // Password alanina kucuk harf kullanılmadan bir şifre gir
                {sanitizeUsername(faker.name().username()),faker.internet().emailAddress(),"TEST135ALLOVER?!& " },
                //Password alanina sadece space tusuna basarak bir şifre gir
                {sanitizeUsername(faker.name().username()), faker.internet().emailAddress()," " .repeat(5)},
                //Pasword alanin bos birak
                {sanitizeUsername(faker.name().username()), " aligel@gmailcom ","" },



        };
    }











}