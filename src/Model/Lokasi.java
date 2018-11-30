/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tri Jaka
 */
public class Lokasi {
    public String nama;
    public String alamat;
    public String id;
    public String deskripsi;
    public Lokasi(String nama, String alamat, String id, String deskripsi){
        this.nama = nama;
        this.alamat = alamat;
        this.id = id;
        this.deskripsi = deskripsi;
    }
}
