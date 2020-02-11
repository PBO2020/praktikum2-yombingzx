package Tugas;

public class Vending {
    String nama_kopi, asal_kopi;
    int stok_kopi;
    
    public void setnamakopi(String nama_kopi){
        this.nama_kopi = nama_kopi;
    }
    public void setasalkopi(String asal_kopi){
        this.asal_kopi = asal_kopi;
    }
    
    public void setstokkopi(int stok_kopi){
        this.stok_kopi=stok_kopi-1;
    }
    
    public String getnamakopi(){
        return nama_kopi;
    }
    public String getasalkopi(){
        return asal_kopi;
    }
    
    public int getstokkopi(){
        return stok_kopi;
    }
    
}
