public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int num3 = -1;
        if (num1 > num2 && num1 > num3) {
            System.out.println("Biggest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Biggest number: " + num2);
        } else {
            System.out.println("Biggest number: " + num3);
        }
    }
}
