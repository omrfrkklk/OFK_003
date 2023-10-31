package model;

import javax.persistence.*;

@Entity
@Table(name = "ogrenci", schema = "mes", catalog = "")
public class OgrenciEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ad", nullable = true, length = 50)
    private String ad;
    @Basic
    @Column(name = "soyad", nullable = true, length = 50)
    private String soyad;
    @Basic
    @Column(name = "ulke", nullable = true, length = 2)
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "OgrenciEntity{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public OgrenciEntity() {
    }

    public OgrenciEntity(int id, String ad, String soyad, String country) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.country = country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
