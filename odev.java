import java.util.Scanner;
public class odev {
    
    static int topla ( int a ,int b ){
        int result = a + b ;
        System.out.print("TOPLAMA İŞLEMİ : " + result);
        return result;
    }
    static int cıkar (int a , int b ){
        int result = a - b;
        System.out.println("İŞLEM : " + result);
        return result;
        
    }
    static int carp ( int a , int b ){
        int result = a * b ;
        System.out.println("İŞLEM " + result);
        return result;
    }
    static int böl ( int a , int b ){
        int result = a / b;
        System.out.println("İŞLEM : " + result);
        return result;
    }
    static int üst( int a ,int b ){
        int result = 1;
        for(int i =1; i<=b; i++){
            result*=a;
        }
        System.out.println("İŞLEM : "+ result) ;
        return result;
    }

    static int mod (int a , int b ){
        int result = a % b ;
        System.out.println("İŞLEM :  " +  result);
        return result;
    }

    static int fackorial(int a , int b ){   
        int result = 1;

        for(int i=1; i<=a; i++){
            result*=i;
        }
        System.out.println("işlem sonucu : "  + result);
        return result;
    }
    static int alan (int a , int b){
        int result = a * b;
        System.out.println("İŞLEM SONUCU : " +result);
        return result;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int  select ;
        String menu = " TOPLAMA : 1 \n " + "ÇIKARMA : 2 \n " + "ÇARPMA : 3 \n " + "BÖLME : 4 \n " + "ÜSLÜ SAYI HESAPLAMA : 5 : \n " + "MOD ALMA  : 6 \n" + "FAKTÖRİYEL HESAPLAMA : 7 \n" + "DİKDÖRTGEN ALAN HESABI : 8 ";
        System.out.println(" ----------HOŞGELDİNİZ----------");
        System.out.print(" İLK SAYIYI GİRİNİZ : ");
        int a = inp.nextInt();
        System.out.print("İKİNCİ SAYI GİRİNİ : ");
        int b = inp.nextInt();    
        System.out.println(menu);
        System.out.println("----------");
        System.out.println( "BİR SEÇİM YAPINIZ : ");
        select = inp.nextInt();
        switch ( select){
            case 1 :
                topla(a, b);
                break;

            case 2 :
                cıkar(a, b);
                break;

            case 3 :
                carp(a, b);
                break;
            case 4 :
                böl(a, b);
                break;
            case 5 : 
                üst(a, b);
                break;         
            case 6 :
                mod(a, b);
                break;
            case 7 :
                fackorial(a, b);
                    break;    
            case 8 :
                alan(a, b);
                break;
            
                default:
                    System.out.println("belirsiz seçim ");           
        }   
    }
}
