/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmprogrami;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class AtmProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        String userName, password;
        int chance=3;
        int bakiye=1000;
        int select;
        
        while(chance>0){
            System.out.print("Kullanici Adinizi Giriniz:");
            userName=inp.nextLine();
            System.out.print("Sifrenizi Giriniz:");
            password=inp.nextLine();
            
            if((userName.equals("patika"))&&(password.equals("dev123"))){
                System.out.println("Sisteme Giris Yaptiniz");
                
                do{
                    System.out.println("1-Para yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cikis Yap");
                System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                select = inp.nextInt();
                
                switch(select){
                    case 1:
                        System.out.print("Yatirmak Istediginiz Miktari Giriniz:");
                        int yatPara=inp.nextInt();
                        bakiye+=yatPara;
                        break;
                    case 2:
                        System.out.print("Cekmek İstediginiz Miktari Giriniz:");
                        int cekPara=inp.nextInt();
                        if(cekPara>bakiye){
                            System.out.println("Bakiye Yetersiz");
                        }else{
                            bakiye-=cekPara;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:"+bakiye);
                        break;
                    
                        
                        
                }
                }while(select!=4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
                
                    
            }else{
                chance--;
                System.out.println("Hatali Giris");
                if(chance==0){
                    System.out.println("Hesabiniz Bloke Oldu");
                }else{
                    System.out.println("Kalan Hakkiniz:"+chance);
                    System.out.println("Tekrar Deneyiniz");
                }
            }
        }
    }
    
}
