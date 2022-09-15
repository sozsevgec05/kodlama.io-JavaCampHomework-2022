public class Main {
    public static void main(String[] args) {
        String[] students = new String[6];
        students[0] = "Ali";
        students[1] = "Ayşe";
        students[2] = "Ahmet";
        students[3] = "Zeynep";
        students[4] = "Sıla";
        students[5] = "Halil";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
