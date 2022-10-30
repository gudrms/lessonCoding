import java.util.Scanner;

public class main6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//
//    while(true){
//      System.out.println("test");
//    }

//    int a = 1;
//    while (a <= 100){
//      System.out.println("test a : " + a);
//      a++;
//    }

//    int a = 1;
//    while (a <= 100) {
//      System.out.println("a = " + a);
//      a++;
//    }
//    System.out.println("a = " + a);

//
//    int a = 1;
//    while (a <= 100){
//      System.out.println("a = " + a);
//      a++;
//    }
//    System.out.println("a = " + a);
//

//
//    int a =13, b=1;
//
//    if (a == 1) {
//      System.out.println("a에 1이 들어있습니다.");
//    }
//    else if (b == 2) {
//      System.out.println("b에 2가 들어있습니다.");
//    }
//    else if (b == 2) {
//      System.out.println("b에 2가 들어있습니다.");
//    }
//    else if (a == 1) {
//      System.out.println("a에 1이 들어있습니다.");
//    }
//    else {
//      System.out.println("위조건과 일치하는 조건이 없습니다.");
//    }

//
//    int a = 1, b =1,c,d;
//
//    while (true) {
//      System.out.println("\n\n다음 중 고르시오 1. 1을 더한다. 2.종료\n 선택 : ");
//      a = sc.nextInt();
//
//      if (a == 1) {
//        b++;
//        System.out.println("b의 현재 숫자 : " + b);
//        if (a == 2) {
//          System.out.println("종료합니다");
//          break;
//        }
//      }
//      System.out.println("\n은 총" + b + "라는 숫자가 나왔습니다.");
//      break;
//      }
//
//    System.out.println("1.타코야키 : 2000\n2.해물찜 : 7000\n3.튀김요리 : 5000\n4.자동차기름 : 12000\n5.종료");
//
//    int c = 1;
//    int money = 0;
//    while (true)
//    {
//      System.out.println(c+"번째 손님 선택 : ");
//      int n = sc.nextInt();
//
//      if (n == 1) {
//        money=money+2000;
//        System.out.println(c+"번째 손님이 타코야끼를 주문하셔서 현재 누적금액"+money+"원 입니다.");
//      }
//      else if (n == 2){
//        money=money+7000;
//        System.out.println(c+"번째 손님이 해물찜을 주문하셔서 현재 누적금액"+money+"원 입니다.");
//      }
//      else if (n == 3){
//        money=money+5000;
//        System.out.println(c+"번째 손님이 튀김요리를 주문하셔서 현재 누적금액"+money+"원 입니다.");
//      }
//      else if (n == 4){
//        money=money+12000;
//        System.out.println(c+"번째 손님이 자동차기름을 주문하셔서 현재 누적금액"+money+"원 입니다.");
//      }
//      else if (n == 5){
//        System.out.println(c+"번째 손님이 종료를 누르셔서 프로그램을 종료 합니다.\n현재 누적금액"+money+"원 입니다.");
//        break;
//      }
//      c++;
//
//
//    }
//
//    System.out.println("몇개의 숫자를 입력 받으시겠습니까? : ");
//    int num = sc.nextInt();
//    int inputNum=1;
//    int count = 3;
//    int result = 0;
//
//    System.out.println("처음에 입력받을 숫자 : ");
//    int one = sc.nextInt();
//    System.out.println("두번째 입력받을 숫자 : ");
//    int two = sc.nextInt();
//    result = one+two;
//    System.out.println(one+"[본인이 생각한 숫자]+"+two+"[본인이 생각한숫자] = "+result+"[결과값]");
//
//    if(num>=3){
//    while (count <= num){
//
//      one = result;
//      System.out.println("두번째 숫자 : ");
//      two = sc.nextInt();
//      result=one+two;
//      System.out.println(one+"[본인이 생각한 숫자]+"+two+"[본인이 생각한숫자] = "+result+"[결과값]");
//      count++;
//
//    }
//    }


/*
    중요문제
    기본적으로 0의 숫자를 가지고 있는 f가 있다.
    f는 10씩 증가하며, 총 1000까지만 늘어난다
    그 다음, f가 500까지 다시 10씩 떨어지는 상황을
    출력하시오.
        단, 풀 수 있는 방식이 두 가지이니 첫 번쨰 방법으로 풀 경우,
    강사가 피드백을 드릴 겁니다.
*/

    int f = 0;
    int a = 0;
    while (true) {
      if(a == 0){
        f = f +10;
        System.out.println(f);
        if(f == 1000){
          a = 1;
        }
      }

      if(a != 0){
        f = f - 10;
        System.out.println(f);
        if (f == 500){
          break;
        }
      }
    }
//    int f=0;
//
//    while (f<1000){
//      f=f+10;
//      System.out.println("f = " + f);
//
//    }
//
//    while(f > 500){
//      f=f-10;
//      System.out.println("f = " + f);
//
//    }

//    int f=0;
//
//    while (true){
//      f=f+10;
//      System.out.println("f = " + f);
//
//      if(f==1000){
//        while(true){
//          f=f-10;
//          System.out.println("f = " + f);
//          if(f==500){
//            break;
//          }
//      }
//        break;
//      }
//    }
//


  }

}


