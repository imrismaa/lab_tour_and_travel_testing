package pages.create_jadwal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateJadwalObject {
    WebDriver driver;

    public CreateJadwalObject(WebDriver driver) {
        this.driver = driver;
    }

    public By hariJadwal() {
        return By.id("day1");
    }

    public By jrkTphJadwal() {
        return By.id("jrk_tph");
    }

    public By wktTphJadwal() {
        return By.id("wkt_tph");
    }

    public By idDestinasi() {
        return By.id("id_dest");
    }

    public By jamMulaiJadwal() {
        return By.id("jam_mulai");
    }

    public By jamSelesaiJadwal() {
        return By.id("jam_selesai");
    }

    public By jamLokasiJadwal() {
        return By.id("jam_lokasi");
    }

    public By saveJadwal() {
        return By.id("create-jadwal");
    }
}
