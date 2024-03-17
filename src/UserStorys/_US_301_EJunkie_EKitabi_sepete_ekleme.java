package UserStorys;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _US_301_EJunkie_EKitabi_sepete_ekleme extends BaseDriver {

    @Test
    public void EKitabiSepeteEkleme(){

     driver.get("https://shopdemo.e-junkie.com/");

     WebElement addToCardBtn= driver.findElement(By.cssSelector("button[onclick=\"return EJProductClick('1595015')\"]"));
     addToCardBtn.click();


        BekleKapat();
    }
}
