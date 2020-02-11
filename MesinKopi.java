package Tugas;
import java.util.Scanner;
import java.util.ArrayList;
public class MesinKopi {
    public static void main(String[] args) {
    MesinKopi x = new MesinKopi();
    x.wow();
    }
    public void wow(){
    ArrayList<Vending> kopi = new ArrayList<>();
    ArrayList<Vending2> toping = new ArrayList<>();
    Vending arabica = new Vending();
    Vending robusta = new Vending();
    Vending flora = new Vending();
    Vending2 cream = new Vending2();
    Vending2 milk = new Vending2();
    Vending2 brown = new Vending2();
    Scanner keyboard = new Scanner(System.in);
//    arabica
    arabica.setnamakopi("Arabica");
    arabica.setasalkopi("Timur Tengah");
    arabica.setstokkopi(20);
    kopi.add(arabica);
//    robusta
    robusta.setnamakopi("Robusta");
    robusta.setasalkopi("Eropa");
    robusta.setstokkopi(20);
    kopi.add(robusta);
//    flora
    flora.setnamakopi("Flora");
    flora.setasalkopi("Asia");
    flora.setstokkopi(20);
    kopi.add(flora);
//    toping
    milk.setnamatoping("Milk");
    milk.setstoktoping(20);
    toping.add(milk);
    
    cream.setnamatoping("Cream");
    cream.setstoktoping(20);
    toping.add(cream);
    
    brown.setnamatoping("Brown Sugar");
    brown.setstoktoping(20);
    toping.add(brown);
    System.out.println("Menu kopi adalah :");
    for(int i=0; i< kopi.size();i++){
        int j= i+1;
        System.out.println("\t"+j+" "+kopi.get(i).getnamakopi());
    }
    System.out.println("Menu Toping adalah ");
    for(int i=0; i< kopi.size();i++){
        int j= i+1;
        System.out.println("\t" +j+ " "+toping.get(i).getnamatoping());
    }
    try{
    kopi.size();
    toping.size();
    System.out.println("Masukan kopi yang mau dipilih ");
        System.out.print("Masukkan Pilihan :");
        int pilihanKopi = keyboard.nextInt() -1;
        System.out.println("Pesanan anda adalah kopi "+kopi.get(pilihanKopi).getnamakopi()+" yang berasal dari " +kopi.get(pilihanKopi).getasalkopi());
        System.out.println("Sisa Stock " +kopi.get(pilihanKopi).getstokkopi());
    } catch (Exception e){
        System.out.println("\nInputan Anda Salah");
        System.out.println(e+"\n");
        wow();
    }
    }
}