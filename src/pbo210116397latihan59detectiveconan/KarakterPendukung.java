/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Detective Conan
 */
package pbo210116397latihan59detectiveconan;

/**
 *
 * @author Zetro
 */
public class KarakterPendukung extends Karakter {
    
    private String hubungan;

    public KarakterPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilKarakterPendukung() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peranan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
        System.out.println("");
    }
}

