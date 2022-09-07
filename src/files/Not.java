package files;

import java.util.Date;

public class Not {
    private String isim;
    private String tanım;
    private Date teslimTarihi;
    private int kazanc;
    private double ilerleme;
    private String gereksinimSeviyesi;
    private int harcananZaman;
    /*Constructor*/

    public Not(String isim, String tanım, int kazanc, double ilerleme, String gereksinimSeviyesi, int harcananZaman) {
        this.isim = isim;
        this.tanım = tanım;
        this.teslimTarihi = new Date();
        this.kazanc = kazanc;
        this.ilerleme = ilerleme;
        this.gereksinimSeviyesi = gereksinimSeviyesi;
        this.harcananZaman = harcananZaman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTanım() {
        return tanım;
    }

    public void setTanım(String tanım) {
        this.tanım = tanım;
    }

    //public Date getTeslimTarihi() {
    //    return teslimTarihi;
    //}

    //public void setTeslimTarihi(Date teslimTarihi) {
    //    this.teslimTarihi = teslimTarihi;
    //}

    public int getKazanc() {
        return kazanc;
    }

    public void setKazanc(int kazanc) {
        this.kazanc = kazanc;
    }

    public double getIlerleme() {
        return ilerleme;
    }

    public void setIlerleme(double ilerleme) {
        this.ilerleme = ilerleme;
    }

    public String getGereksinimSeviyesi() {
        return gereksinimSeviyesi;
    }

    public void setGereksinimSeviyesi(String gereksinimSeviyesi) {
        this.gereksinimSeviyesi = gereksinimSeviyesi;
    }

    public int getHarcananZaman() {
        return harcananZaman;
    }

    public void setHarcananZaman(int harcananZaman) {
        this.harcananZaman = harcananZaman;
    }
}
