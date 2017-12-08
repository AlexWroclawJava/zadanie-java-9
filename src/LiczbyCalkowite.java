public class LiczbyCalkowite {

    public static void main(String[] args) {

        int[] tablicaLiczbcalkowitych = new int[5];
        int suma;

        tablicaLiczbcalkowitych[0] = 10;
        tablicaLiczbcalkowitych[1] = 20;
        tablicaLiczbcalkowitych[2] = 30;
        tablicaLiczbcalkowitych[3] = 40;
        tablicaLiczbcalkowitych[4] = 100;

        suma = tablicaLiczbcalkowitych[0] + tablicaLiczbcalkowitych[2] + tablicaLiczbcalkowitych[4];
        System.out.println("Suma 1,3ciej i 5tej liczby calkowitej z tablicy wynosi: " + suma);
    }
}
