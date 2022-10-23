package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
   /* By btnSatu = By.id("com.google.android.calculator:id/digit_1");
    By btnDua = By.id("com.google.android.calculator:id/digit_2");
    By btnTambah = By.id("com.google.android.calculator:id/op_add");
    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
    By hasil = By.id("com.google.android.calculator:id/result_final");
    /* web: xpath = //taghtml[contains(@attr, value)] */

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnSatu;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    private MobileElement btnTiga;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    private MobileElement btnDelapan;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnKurang;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;

    @AndroidFindBy(id = " com.google.android.calculator:id/op_div")
    private MobileElement btnBagi;


    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;
    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;

    public void pengurangan(){
        btnDua.click();
        System.out.println("Click Button Angka 2");
        btnKurang.click();
        System.out.println("Click Button Kurang");
        btnSatu.click();
        System.out.println("Click Button Angka 1");
        btnSamaDengan.click();
        System.out.println("Click Button SamaDengan");
    }

    public void perkalian(){
        btnEmpat.click();
        System.out.println("Click Button Angka 4");
        btnKali.click();
        System.out.println("Click Button Kali");
        btnTiga.click();
        System.out.println("Click Button Angka 3");
        btnSamaDengan.click();
        System.out.println("Click Button Samadengan");
    }

    public void pembagian(){
        btnDelapan.click();
        System.out.println("Click Button Angka 8");
        btnBagi.click();
        System.out.println("Click Button Bagi");
        btnEmpat.click();
        System.out.println("Click Button Angka 4");
        btnSamaDengan.click();
        System.out.println("Click Button Samadengan");
    }

    public String getTxtResult() {
        return hasil.getText();
    }

   // @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
   // private MobileElement btnTambah;

    //Method
   /* public void calcAdd() {
        driver.findElement(btnSatu).click();
        driver.findElement(btnTambah).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan).click();
    }

    public String getTxtResult() {
        return driver.findElement(hasil).getText();
    }

    */

}
