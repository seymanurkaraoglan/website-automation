package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hüseyin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        */
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//p//a")).click();//SİSTEME GİRİŞ
        //ANA SAYFA
        WebElement Bird_c = driver.findElement(By.cssSelector("area[coords='72,2,280,250']"));
        if (Bird_c.isDisplayed()) {
            System.out.println("goruldu");
        }
        //ÜYE OLMA
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("zasude");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("se2zq691");
        driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("se2zq691");
        driver.findElement(By.cssSelector("input[name='account.firstName']")).sendKeys("asude");
        driver.findElement(By.cssSelector("input[name='account.lastName']")).sendKeys("karaoglan");
        driver.findElement(By.cssSelector("input[name='account.email']")).sendKeys("zasude@gmail.com");
        driver.findElement(By.cssSelector("input[name='account.phone']")).sendKeys("5317854234");
        driver.findElement(By.cssSelector("input[name='account.address1']")).sendKeys("cesur sok");
        driver.findElement(By.cssSelector("input[name='account.address2']")).sendKeys("begonya sok");
        driver.findElement(By.cssSelector("input[name='account.city']")).sendKeys("istanbul");
        driver.findElement(By.cssSelector("input[name='account.state']")).sendKeys("umraniye");
        driver.findElement(By.cssSelector("input[name='account.zip']")).sendKeys("2");
        driver.findElement(By.cssSelector("input[name='account.country']")).sendKeys("Turkey");
        driver.findElement(By.cssSelector("option[value='REPTILES']")).click();
        driver.findElement(By.cssSelector("input[name='account.listOption']")).click();
        driver.findElement(By.cssSelector("input[name='newAccount']")).click();
        //ÜYE GİRİŞİ
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("zasude");
        WebElement pass = driver.findElement(By.cssSelector("input[name='password']"));
        pass.sendKeys(Keys.CONTROL, "a");
        pass.sendKeys(Keys.DELETE);
        pass.sendKeys("se2zq691");
        driver.findElement(By.cssSelector("input[name='signon']")).click();
        WebElement hesap_giris = driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]"));
        if (hesap_giris.isDisplayed()) {
            System.out.println("hesaba giris saglandi");
        }
        //SEARCH BOX'TA ÜRÜN ARAMA
        driver.findElement(By.cssSelector("input[name='keyword']")).sendKeys("Manx");
        driver.findElement(By.cssSelector("input[name='searchProducts']")).click();
        WebElement urun_arama = driver.findElement(By.cssSelector("img[src='../images/cat2.gif']"));
        if(urun_arama.isDisplayed()){
            System.out.println("manx cinsi kedi ekrana geldi");
            urun_arama.click();
            driver.findElement(By.ByCssSelector.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-14']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrderForm=']")).click();
            driver.findElement(By.cssSelector("input[name='newOrder']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrder=&confirmed=true']")).click();
            driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
        }
        //KUS GRUBUNA GİRİŞ
        driver.findElement(By.cssSelector("area[coords='72,2,280,250']")).click();
        WebElement birdp = driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=AV-CB-01']"));
        if(birdp.isDisplayed()){
            System.out.println("kuslar goruldu");
            birdp.click(); //EKRANDA KATEGORİ GÖRÜLDÜYSE İŞLEM DEVAM EDER.
            driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-18']")).click();
            driver.findElement(By.cssSelector("input[name='updateCartQuantities']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrderForm=']")).click();//SİPARİŞ VERİLDİ
            driver.findElement(By.cssSelector("input[value='Continue']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrder=&confirmed=true']")).click();
            WebElement confirm = driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
            if(confirm.isDisplayed()){ //ÖDEME SAYFASI GÖRÜLDÜ MÜ?
                System.out.println("odeme yapildi");
            }
            driver.findElement(By.id("BackLink")).click();
        }
        driver.findElement(By.cssSelector("area[coords='60,250,130,320']")).click();//KÖPEK KATEGORİSİNE GİDİLİR.
        WebElement dogsp = driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=K9-BD-01']"));
        if(dogsp.isDisplayed()){
            dogsp.click(); //EKRANDA BELİRDİ Mİ?
            driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-6']")).click();
            System.out.println("kopekler eklendi");
        }
        driver.findElement(By.cssSelector("img[src='../images/sm_cats.gif']")).click(); //KEDİ AKTEGORİSİ
        WebElement cats = driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FL-DLH-02']"));
        if(cats.isDisplayed()){
            cats.click();
            driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-16']")).click();
            WebElement adet = driver.findElement(By.cssSelector("input[name='EST-16']"));
            adet.sendKeys(Keys.CONTROL, "a");
            adet.sendKeys(Keys.DELETE);
            adet.sendKeys("5");//EKLEMEK İSTEDİĞİMİZ SAYIYI DEĞİŞTİRİYORUZ
            //driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-17']")).click();
            driver.findElement(By.cssSelector("input[name='updateCartQuantities']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrderForm=']")).click();
            driver.findElement(By.cssSelector("input[value='Continue']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrder=&confirmed=true']")).click();
            WebElement confirm2 = driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));//SİPARİŞ VERDİK
            if(confirm2.isDisplayed()){
                System.out.println("odeme yapildi");
            }
            driver.findElement(By.id("BackLink")).click();
        }
            //HESAP ŞİFRESİ DEĞİŞTİRME
            driver.findElement(By.cssSelector("a[href='/actions/Account.action?editAccountForm=']")).click();
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("se2zq691-1004");
            driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("se2zq691-1004");
            driver.findElement(By.cssSelector("input[name='editAccount']")).click();
            driver.findElement(By.cssSelector("img[src='../images/sm_reptiles.gif']")).click();
            driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=RP-SN-01']")).click();
            //ÜRÜN EKLENDİ
            driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-11']")).click();
            //ÜRÜN SİLİNDİ
            driver.findElement(By.cssSelector("a[href='/actions/Cart.action?removeItemFromCart=&workingItemId=EST-11']")).click();
            //HESAPTAN ÇIKIŞ
            driver.findElement(By.cssSelector("a[href='/actions/Account.action?signoff=']")).click();
            WebElement signin = driver.findElement(By.cssSelector("a[href='/actions/Account.action?signonForm=']"));
            if(signin.isDisplayed()){
                System.out.println("cikis yapildi");
            }
        }


    }
