package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDestinationPage {
    WebDriver driver;

    public CreateDestinationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getActualURL() {
        return driver.getCurrentUrl();
    }

    By namaDestinasi = By.id("nama_destinasi");
    By jenisDestinasi = By.id("type1");
    By namaKota = By.id("kota");
    By jamBuka = By.id("jam_buka");
    By jamTutup = By.id("jam_tutup");
    By zonaWaktu = By.id("zone1");
    By hariTutup = By.id("hari_tutup1");
    By hargaWni = By.id("harga_wni");
    By hargaWna = By.id("harga_wna");
    By tema = By.id("id_tema1");
    By koordinat = By.id("koordinat");
    By deskripsi = By.id("deskripsi");
    By saveBtn = By.id("create-destinasi");

    public void enterNamaDestinasi(String destinasi) {
        driver.findElement(namaDestinasi).sendKeys(destinasi);
    }
    public void enterJenisDestinasi() {
        driver.findElement(jenisDestinasi).click();
    }
    public void enterNamaKota(String kota) {
        driver.findElement(namaKota).sendKeys(kota);
    }
    public void enterJamBuka(String jam) {
        driver.findElement(jamBuka).sendKeys(jam);
    }
    public void enterJamTutup(String jam) {
        driver.findElement(jamTutup).sendKeys(jam);
    }
    public void enterZonaWaktu() {
        driver.findElement(zonaWaktu).click();
    }
    public void enterHariTutup() {
        driver.findElement(hariTutup).click();
    }
    public void enterHargaWni(String harga) {
        driver.findElement(hargaWni).sendKeys(harga);
    }
    public void enterHargaWna(String harga) {
        driver.findElement(hargaWna).sendKeys(harga);
    }
    public void enterTema() {
        driver.findElement(tema).click();
    }
    public void enterKoordinat(String koor) {
        driver.findElement(koordinat).sendKeys(koor);
    }
    public void enterDeskripsi(String desk) {
        driver.findElement(deskripsi).sendKeys(desk);
    }
    public void clickSave() {
        driver.findElement(saveBtn).click();
    }
}
