/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author trijakapam
 */
public class Rute {
    private String noPolisi;
    private String lokasi;

    public Rute(String noPolisi, String lokasi) {
        this.noPolisi = noPolisi;
        this.lokasi = lokasi;
    }
    

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    
    
}
