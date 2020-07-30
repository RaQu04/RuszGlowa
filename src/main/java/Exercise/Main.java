package Exercise;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int iloscTrafien = 0;

        int iloscRuchow = 0;
        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random() * 5);
        ProstyPortal prostyPortal = new ProstyPortal(random);

        System.out.println("Random " + random);


        while (iloscTrafien < 3) {
            System.out.println("Podaj pole: ");
            int value = scanner.nextInt();

//            BufferedReader value = new BufferedReader(new InputStreamReader(System.in));
            String sprawdz = prostyPortal.sprawdz(value);


            if (sprawdz.equals("Trafiles")) {
                iloscTrafien++;
            }
            System.out.println(sprawdz);
            iloscRuchow++;
            if (iloscTrafien == 3) {
                System.out.println("Portal zatopiony, wygrałeś!\nPotrzebowałeś ruchów: " + iloscRuchow);
            }
        }
    }
}
