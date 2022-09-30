package _01_Runners;

import _02_PomPages.Pom;
import _04_Utilities.GWD;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_A101_Runner extends  GWD{

    @Test
    void A101(){
    Pom pom=new Pom(GWD.driver);

    pom.ClickPom("cookies");
    pom.ClickPom("a101");
    pom.MoveToElementPom("giyimaksesuar");
    pom.MoveToElementPom("giyimaksesuar");
    pom.MoveAndClickToElementPom("dizalticorap");
    pom.ClickPom("penticorap");
    pom.VerifyToElementPom("siyah","siyah");
    pom.ClickPom("sepeteEkle");
    pom.ClickPom("sepetiGoruntule");
    pom.ClickPom("sepetiOnayla");
    pom.ClickPom("uyeOlmadan");
    pom.SendKeysToElementPom("userEmail","sbdfgsxsdccrdhgfk@gmail.com");




        pom.ClickPom("devamEt");

        pom.ClickPom("newAddress");
        pom.SendKeysToElementPom("addressTitle", "Muğla Evim");
        pom.SendKeysToElementPom("name", "Vadi");
        pom.SendKeysToElementPom("lastName", "Elma");
        pom.SendKeysToElementPom("phoneNumber", "5069377957");
        pom.selectToElementOnThePom("city", "39","childElementCount","82");
        pom.selectToElementOnThePom("township","2","childElementCount", "16");
        pom.selectToElementOnThePom("district","35","childElementCount","96" );
        pom.SendKeysToElementPom("textArea", "257 Sokullu Berke bulvarı Muz caddesi sokak No:4");

        pom.ClickPom("save");

        pom.ClickPom("radio");
        pom.ClickPom("saveAndGo");
       // pom.domPropertyToBePom("saveAndGo","childElementCount","0");

        pom.VerifyToElementPom("assertKart", "Kart ile ödeme");


    }
}
