public class Main {
    public static void main(String[] args) {
        double[] myList = {3.2, 5.3, 7.3, 9.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam =  " + total);
        System.out.println("En buyuk =  " + max);
    }
}
