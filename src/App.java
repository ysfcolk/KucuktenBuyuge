import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı giriniz:");
        a = inp.nextInt();

        System.out.print("İkinci Sayıyı giriniz:");
        b = inp.nextInt();

        System.out.print("Üçüncü Sayıyı giriniz:");
        c = inp.nextInt();

        if(a>b && a>c){
            if(b>c){   
            System.out.println("a>b>c");
        }else {
            System.out.println("a>c>b");
        }
        }else if (b>a && b>c){
           if(a>c){
               System.out.println("b>a>c");
           }else{
               System.out.println("b>c>a");
           }
        }else {
            if(b>a){
                System.out.println("c>b>a");
            }else{
                System.out.println("c>a>b");
            }
        }
    }
}
