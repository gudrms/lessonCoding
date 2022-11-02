//
//while문을 필수적으로 사용해야 하는 문제입니다.
//    총 10개의 숫자를 입력받습니다.
//    해당 10개의 숫자 중에서 가장 큰 숫자를 맞출 수 있는 프로그램을 개발해보겠습니다.
//    만약 해당 10개의 숫자 중에서 가장 큰 숫자를 맞추지 못했다면, 총 5번의 기회를 새로 주고,
//    (5번 중 정답을 맞췄다면 끝나게)
//    새로 준 기회 안에서 정답을 맞추지 못했다면 끝내주세요.
//    다만 여기서 중요한 건 '기회'의 개념과 제일 처음에 돌려서 맞추는 개념은 서로
//    다른 코드로 반영이 되어야 합니다.

import java.util.Scanner;

public class main221102_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int count = 1;

    System.out.println("10개의 숫자를 입력하세요.");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int g = sc.nextInt();
    int h = sc.nextInt();
    int i = sc.nextInt();
    int j = sc.nextInt();



    while (count<=5) {
      System.out.println("가장 큰수를 골라주세요");
//      System.out.println("1. "+a+"\n2. "+b+"\n3. "+c+"\n"+"4. "+d+"\n5. "+e+"\n6. "+f+"\n7. "+g+"\n"+"8. "+h+"\n9. "+i+"\n10. "+j);
      System.out.println(a+"\n"+b+"\n"+c+"\n"+""+d+"\n"+e+"\n"+f+"\n"+g+"\n"+""+h+"\n"+i+"\n"+j);

      int big = sc.nextInt();

      if (big == 1) {
        if(a>b && a>c && a > d && a > e && a > f && a > g && a > g && a > h && a > i && a > j){
          System.out.println("정답입니다.");
          break;
        }else {
          System.out.println("오답입니다.");
        }
      }





    }




  }

  public static int select() {
    return 0;


  }
}
