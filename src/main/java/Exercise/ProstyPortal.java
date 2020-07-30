package Exercise;

public class ProstyPortal {

    int start;
    int[] tab;
    boolean[] flagi = new boolean[3];

    public ProstyPortal(int start) {
        this.start = start;
        tab = setPola();
    }


    int[] setPola() {
        int[] pola = new int[3];

        for (int i = 0; i < pola.length; i++) {
            pola[i] = start++;
        }
        for (int value :
                pola) {
            System.out.println(value);

        }
        return pola;
    }

    String sprawdz(int wybor) {

        String odp = "Nie trafiles";


        for (int i = 0, tabLength = tab.length; i < tabLength; i++) {
            int value = tab[i];
            if (wybor == value && !flagi[i]) {
                odp = "Trafiles";
                flagi[i] = true;
                break;
            }else if(wybor == value && flagi[i]){
                return "Błędny wybór";

            }
        }
        return odp;
    }

}
