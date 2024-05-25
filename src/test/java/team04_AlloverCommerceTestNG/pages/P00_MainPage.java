package team04_AlloverCommerceTestNG.pages;

public class P00_MainPage {

    public void Pages() {}
        private P01_HomePage homePage;
        private P02_RegisterPage registerPage;
        private P03_LoginPage userVendorLoginPage;
        private P04_MyAccountPage myAccountPage;
        private P05_AddressesPage addressesPage;
        private P06_AccountDetails accountDetails;
        private P07_ShoppingPage shoppingPage;
        private P08_ProductPage productPage;
        private P09_CartPage cartPage;
        private P10_CheckOutPage checkOutPage;
        private P11_OrderCompletePage orderCompletePage;
        private P12_ComparePage comparePage;
        private P13_WishlistPage wishlistPage;
        private P14_VendorRegisterPage vendorRegisterPage;

        private P15_VendorAddressesPage vendorAddressesPage;
        private P16_VendorStoreManagerPage vendorStoreManagerPage;
        private P17_VendorProductsDashboardPage vendorProductDashboardPage;
        private P18_VendorProductManagerPage vendorProductManagerPage;
        private P19_OrdersPage orderPage;
        private P20_VendorCouponsPage vendorCouponsPage;


        public P01_HomePage homePage () {
            if (homePage == null) {
                homePage = new P01_HomePage();
            }
            return homePage;
        }
    public P02_RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new P02_RegisterPage();
        }

        return registerPage;
    }

    public P03_LoginPage userVendorLoginPage() {
        if (userVendorLoginPage == null) {
            userVendorLoginPage = new P03_LoginPage();
        }
        return userVendorLoginPage;
    }

    public P04_MyAccountPage myAccountPage() {
        if (myAccountPage == null) {
            myAccountPage = new P04_MyAccountPage();
        }
        return myAccountPage;
    }
    public P05_AddressesPage addressesPage() {
        if (addressesPage == null) {
            addressesPage = new P05_AddressesPage();
        }
        return addressesPage;
    }

    public P06_AccountDetails accountDetails(){
        if(accountDetails == null) {
            accountDetails = new P06_AccountDetails();
        }
        return accountDetails;
    }

    public P07_ShoppingPage shoppingPage(){
        if(shoppingPage == null) {
            shoppingPage = new P07_ShoppingPage();
        }
        return shoppingPage;
    }

    public P08_ProductPage productPage(){
        if(productPage == null) {
            productPage = new P08_ProductPage();
        }
        return productPage;
    }

    public P09_CartPage cartPage(){
        if(cartPage == null) {
            cartPage = new P09_CartPage();
        }
        return cartPage;
    }

    public P10_CheckOutPage checkOutPage(){
        if(checkOutPage == null) {
            checkOutPage = new P10_CheckOutPage();
        }
        return checkOutPage;
    }

    public P11_OrderCompletePage orderCompletePage(){
        if(orderCompletePage == null) {
            orderCompletePage = new P11_OrderCompletePage();
        }
        return orderCompletePage;
    }

    public P12_ComparePage comparePage(){
        if(comparePage == null) {
            comparePage = new P12_ComparePage();
        }
        return comparePage;

    }
    public P13_WishlistPage wishlistPage(){
        if(wishlistPage == null) {
            wishlistPage = new P13_WishlistPage();
        }
        return wishlistPage;
    }

    public P14_VendorRegisterPage vendorRegisterPage(){
        if(vendorRegisterPage == null) {
            vendorRegisterPage = new P14_VendorRegisterPage();
        }
        return vendorRegisterPage;
    }

    public P15_VendorAddressesPage vendorAddressesPage(){
        if(vendorAddressesPage == null) {
            vendorAddressesPage = new P15_VendorAddressesPage();
        }
        return vendorAddressesPage;
    }

    public P16_VendorStoreManagerPage vendorStoreManagerPage(){
        if(vendorStoreManagerPage == null) {
            vendorStoreManagerPage = new P16_VendorStoreManagerPage();
        }
        return vendorStoreManagerPage;
    }

    public P17_VendorProductsDashboardPage vendorProductDashboardPage(){
        if(vendorProductDashboardPage == null) {
            vendorProductDashboardPage = new P17_VendorProductsDashboardPage();
        }
        return vendorProductDashboardPage;
    }

    public P18_VendorProductManagerPage vendorProductManagerPage(){
        if(vendorProductManagerPage == null) {
            vendorProductManagerPage = new P18_VendorProductManagerPage();
        }
        return vendorProductManagerPage;
    }
    public P19_OrdersPage orderPage(){
        if(orderPage == null) {
            orderPage = new P19_OrdersPage();
        }
        return orderPage;
    }
    public P20_VendorCouponsPage vendorCouponsPage(){
        if(vendorCouponsPage== null) {
            vendorCouponsPage= new P20_VendorCouponsPage();
        }
        return vendorCouponsPage;
    }

}