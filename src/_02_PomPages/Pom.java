package _02_PomPages;

import _04_Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Parent{




    public Pom(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[text()='Kabul Et']")
    public WebElement cookies;
    @FindBy(css = "[loading='lazy']")
    public WebElement a101;
    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public WebElement giyimaksesuar;
    @FindBy(xpath = "//a[contains(@title,'Kadın İç Giyim')]//following::a[7]")
    public WebElement dizalticorap;
    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    public WebElement penticorap;
    @FindBy(xpath = "//*[text()='SİYAH']")
    public WebElement siyah;
    @FindBy(xpath = "//button//following::button[5]")
    public WebElement sepeteEkle;
    @FindBy(linkText = "Sepeti Görüntüle")
    public WebElement sepetiGoruntule;
    @FindBy(linkText = "Sepeti Onayla")
    public WebElement sepetiOnayla;
    @FindBy(partialLinkText = "ÜYE OLMADAN")
    public WebElement uyeOlmadan;
    @FindBy(name = "user_email")
    public WebElement userEmail;
    @FindBy(xpath = "//following::button[6]")
    public WebElement devamEt;
    @FindBy(css = "a[title='Yeni adres oluştur']")
    public WebElement newAddress;
    @FindBy(css = "input[placeholder='Ev adresim, iş adresim vb.']")
    public WebElement addressTitle;
    @FindBy(css = "input[name='first_name']")
    public WebElement name;
    @FindBy(css = "input[name='last_name")
    public WebElement lastName;
    @FindBy(css = "input[name='phone_number']")
    public WebElement phoneNumber;
    @FindBy(css = "select[name='city")
    public WebElement city;
    @FindBy(css = "select[name='township']")
    public WebElement township;
    @FindBy(css = "select[name='district']")
    public WebElement district;
    @FindBy(css = "textarea[name='line']")
    public WebElement textArea;
    @FindBy(xpath = "//div//button[contains(text(),'KAYDET')]")
    public WebElement save;
    @FindBy(xpath = "//input[@value='333']/..//div")
    public WebElement radio;
    @FindBy(xpath = "//button[contains(text(),'Kaydet ve Devam Et')]")
    public WebElement saveAndGo;
    @FindBy(xpath = "//div[contains(text(),'Kart ile ödeme')]")
    public WebElement assertKart;


    WebElement myElement;
    public void ClickPom(String strElement) {
        switch (strElement){
            case "cookies":myElement=cookies;break;
            case "a101":myElement=a101;break;
            case "sepetiGoruntule":myElement=sepetiGoruntule;break;
            case "newAddress":myElement=newAddress;break;
            case "dizalticorap":myElement=dizalticorap;break;
            case "saveAndGo":myElement=saveAndGo;break;
            case "penticorap":myElement=penticorap;break;
            case "sepeteEkle":myElement=sepeteEkle;break;
            case "sepetiOnayla":myElement=sepetiOnayla;break;
            case "uyeOlmadan":myElement=uyeOlmadan;break;
            case "devamEt":myElement=devamEt;break;
            case "save":myElement=save;break;
            case "radio":myElement=radio;break;


        }
        ClickParent(myElement);
    }
    public void MoveToElementPom(String strElement){
        switch (strElement){
            case "giyimaksesuar":myElement=giyimaksesuar;break;
        }
        MoveToElementParent(myElement);
    }
    public void MoveAndClickToElementPom(String  strElement){
        switch (strElement){
            case "dizalticorap":myElement=dizalticorap;break;
        }
        MoveAndClickToElementParent(myElement);
    }
    public void VerifyToElementPom(String strElement,String text){
        switch (strElement){
            case "siyah":myElement=siyah;break;
            case "assertKart":myElement=assertKart;break;
        }
        VerifyToElementParent(myElement,text);
    }
    public void SendKeysToElementPom(String strElement,String text){
        switch (strElement){
            case "userEmail":myElement=userEmail;break;
            case "addressTitle":myElement=addressTitle;break;
            case "name":myElement=name;break;
            case "lastName":myElement=lastName;break;
            case "phoneNumber":myElement=phoneNumber;break;
            case "textArea":myElement=textArea;break;
        }
        SendKeysParent(myElement, text);
    }
    public void selectToElementOnThePom(String strElement,String OptionValue,String propertyName,String childCount){
        switch (strElement){
            case "city":myElement=city;break;
            case "township":myElement=township;break;
            case "district":myElement=district;break;
        }
        int optionvalue=Integer.parseInt(OptionValue);
        selectToElementOnTheParent(myElement,optionvalue,propertyName,childCount);
    }
   /* public static void domPropertyToBePom(String strElement,String propertyName,String value) {

        switch (strElement) {
            case "saveAndGo": myElement = saveAndGo ; break;
        }
        domPropertyToBeParent(myElement,propertyName,value);


    }*/
}
