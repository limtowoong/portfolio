package examAverage;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // 우리반 국어 성적의 평균 구하기
        int[] kors = new int[5];
        Scanner sc = new Scanner(System.in);
       
        // 1. 성적 입력
        System.out.println("┌───────────────────────────────────┐");
        System.out.println("│           1.input score           │");
        System.out.println("└───────────────────────────────────┘");
        for(int i=0; i<kors.length; i++) {
            System.out.printf("input kor score!!");
            kors[i] = sc.nextInt();
        }
        System.out.println("────────────────────────────────────");
        System.out.println("────────────────────────────────────");


        // 2. 성적 출력
        System.out.println("┌───────────────────────────────────┐");
        System.out.println("│           2.print score           │");
        System.out.println("└───────────────────────────────────┘");
       
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
        System.out.println("────────────────────────────────────");
        System.out.println("────────────────────────────────────");

        // 3. 종료
       

        // 배열[]에 성적을 입력받아
        // 배열[] total, avg 계산
       
    }
}
