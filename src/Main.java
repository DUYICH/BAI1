import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieucao;
        System.out.printf("Nhập vào chiều cao của tam giác: ");
        chieucao = sc.nextInt();
        for (int i = 1; i <= chieucao; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");

        Scanner sr = new Scanner(System.in);
        int chieudai;
        System.out.printf("Nhập vào chiều dài của hinh vuong: ");
        chieudai = sr.nextInt();
        for (int i = 0; i < chieudai; i++) {
            for (int j = 0; j < chieudai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");




    }


}
