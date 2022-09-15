public class Main {
    public static void main(String[] args) {
        System.out.println("For Döngüsü");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("For Döngüsü Bitti.");

        System.out.println("While Döngüsü");
        int i = 1;
        while (i < 10){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("While Döngüsü Bitti.");


        System.out.println("Do While Döngüsü");

        int j = 1;
        do {
            System.out.println("j = " + j);
            j+=2;
        }while (j < 10);
        System.out.println("Do While Döngüsü Bitti.");

    }
}

