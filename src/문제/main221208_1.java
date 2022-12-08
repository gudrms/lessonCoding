package 문제;

import java.util.Scanner;

public class main221208_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int c[] =new int[999];
    String n[] =new String[999];
    int n1[] = new int[999];
    int n2[] = new int[999];
    int count=0;


    while (true) {

      System.out.println("지금부터 게임을 시작합니다.");
      for (int i = 1; i <= 4; i++) {
        c[i] = sc.nextInt();
        System.out.println(i + "번째 번호 입력");
        sum = sum + c[i];

      }

      for (int i = 1; i <= 4; i++) {
        System.out.println(i + "플레이어의 이름을 입력하세요");
        n[i] = sc.nextLine();
        System.out.println(i + "플레이어의 이름 : " + n[i]);
      }

      for (int i = 1; i <= 4; i++) {
        System.out.print(n[i]+"님, ");
      }
      System.out.println("반갑습니다");

        System.out.println(n[1]+"님 부터 시작합니다.");

        for (int j = 1; j < 999; j++) {
          System.out.print(n[1]+"님이 입력할 번호 : ");
          n1[j] = sc.nextInt();


          if (n1[j] == sum) {

            if (j%5 == 0 || j%7 == 0) {
              if (j % 5 == 0) {
                System.out.println("오답입니다!");
                sum+=1200;
              }
              else if(j % 7 == 0) {
                System.out.println("오답입니다!");
                sum-=560;
              }

              sum/
            }

            System.out.println("정답입니다!! 완벽하십니다!! 멋지세요!!");
            System.out.println(n[1]+"님 승리!!");
            break;
          }
          else if(n1[j] <= sum) {
            System.out.println("정답이 "+n[1]+"님이 입력하신 숫자보다 큽니다.!");
          }
          else if (n1[j] >= sum) {
            System.out.println("정답이 "+n[1]+"님이 입력하신 숫자보다 작습니다.!");
          }

          System.out.print(n[2]+"님이 입력할 번호 : ");
          n2[j] = sc.nextInt();

          if (n2[j] == sum) {
            System.out.println("정답입니다!! 완벽하십니다!! 멋지세요!!");
            System.out.println(n[2]+"님 승리!!");
            break;
          }
          else if(n2[j] <= sum) {
            System.out.println("정답이 "+n[2]+"님이 입력하신 숫자보다 큽니다.!");
          }
          else if (n2[j] >= sum) {
            System.out.println("정답이 "+n[2]+"님이 입력하신 숫자보다 작습니다.!");
          }


        }




    }








  }


}
