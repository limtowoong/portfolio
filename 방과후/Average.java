package examAverage;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // �츮�� ���� ������ ��� ���ϱ�
        int[] kors = new int[5];
        Scanner sc = new Scanner(System.in);
       
        // 1. ���� �Է�
        System.out.println("��������������������������������������������������������������������������");
        System.out.println("��           1.input score           ��");
        System.out.println("��������������������������������������������������������������������������");
        for(int i=0; i<kors.length; i++) {
            System.out.printf("input kor score!!");
            kors[i] = sc.nextInt();
        }
        System.out.println("������������������������������������������������������������������������");
        System.out.println("������������������������������������������������������������������������");


        // 2. ���� ���
        System.out.println("��������������������������������������������������������������������������");
        System.out.println("��           2.print score           ��");
        System.out.println("��������������������������������������������������������������������������");
       
        int total=0;
        float avg;
       
        for(int i=0; i<kors.length; i++) {
            total = total + kors[i];
        }
       
        avg = total/5f;
       
        for(int i=0; i<kors.length; i++) {
            System.out.printf("%d \t", kors[i]);
        }
        System.out.println();
        System.out.printf("total: %3d \n", total);
        System.out.printf("average: %6.2f \n", avg);
        System.out.println("������������������������������������������������������������������������");
        System.out.println("������������������������������������������������������������������������");

        // 3. ����
       

        // �迭[]�� ������ �Է¹޾�
        // �迭[] total, avg ���
       
    }
}