import java.io.File;
import java.io.IOException;

public class DosyaOlusturma {
    public static void main(String[] args) {
        File dosya = new File("ornekdosya.txt");
        try {
            if (!dosya.exists()){
                dosya.createNewFile();
                System.out.println("Dosya başarıyla oluşturuldu.");
            }else {
                System.out.println("Dosya zaten var.");
            }

        }catch (IOException e ){
            System.out.println("Bir hata oluştu.");
        }
    }
}
