import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fizik,kimya,turkce,muzik,invalidLesson =0 , totalLesson=5;
        System.out.println("Matematik notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.println("Müzik notunuzu Giriniz: ");
        muzik = input.nextInt();

        if ((mat<0) || (mat>100)){
            mat = 0;
            invalidLesson++;
        }
        if ((fizik<0) || (fizik>100)){
            fizik = 0;
            invalidLesson++;
        }
        if ((kimya<0) || (kimya>100)){
            kimya =0;
            invalidLesson++;
        }
        if ((turkce<0) || (turkce>100)){
            turkce = 0;
            invalidLesson++;
        }
        if ((muzik<0) || (muzik>100)){
            muzik =0;
            invalidLesson++;
        }
         double average= (mat+fizik+kimya+turkce+muzik) / (totalLesson-invalidLesson);
        if (average<55){
            System.out.println("Sınıfta kaldınız");
        } else {
            System.out.println("Sınıfı geçtiniz");
        }
         System.out.println("Ortalamanız: "+average);

    }
}
