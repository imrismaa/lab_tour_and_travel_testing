package pages.jadwal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JadwalObject {
    WebDriver driver;
    String id_jadwaldestinasi = "700";

    public JadwalObject(WebDriver driver) {
        this.driver = driver;
    }

    public By tambahJadwal() {
        return By.id("tambah-jadwal-destinasi");
    }

    public By editJarak() {
        return By.id("edit-jt-" + id_jadwaldestinasi);
    }

    public By editWaktu() {
        return By.id("edit-wt-" + id_jadwaldestinasi);
    }

    public By editTujuan() {
        return By.id("edit-id-" + id_jadwaldestinasi);
    }

    public By editMulai() {
        return By.id("edit-mulai-" + id_jadwaldestinasi);
    }

    public By editSelesai() {
        return By.id("edit-selesai-" + id_jadwaldestinasi);
    }

    public By hapusJadwal() {
        return By.id("del-jadwal-710");
    }
}
