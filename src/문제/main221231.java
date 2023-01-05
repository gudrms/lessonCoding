package 문제;

import java.util.Scanner;

public class main221231 {
  public static void main(String[] args) {
    calculator();

  }

  public static int calculator() {
    Scanner sc = new Scanner(System.in);

    int oneN = 0;
    int twoN = 0;
    String  operator ;
    int result = 0;
    int count = 0;

    while (true) {
      System.out.println("첫번째 숫자를 입력하세요");
      oneN = sc.nextInt();

      System.out.println("연산자를 입력하세요\n + 또는 -");
      operator = sc.next();

      System.out.println("두번째 숫자를 입력하세요");
      twoN = sc.nextInt();

      if (operator.equals("+")) {
        result = oneN + twoN;
        System.out.println(oneN+" + " +twoN+" = "+ result);
        count++;
      }
      else if (operator.equals("-")) {
        result = oneN - twoN;
        System.out.println(oneN+" - " +twoN+" = "+ result);
        count++;
      }

      while (true) {

        if (count > 0) {

          oneN = result;

          System.out.println("연산자를 입력하세요\n + 또는 -");
          operator = sc.next();

          System.out.println("두번째 숫자를 입력하세요");
          twoN = sc.nextInt();

          if (operator.equals("+")) {
            result = oneN + twoN;
            System.out.println(oneN + " + " + twoN + " = " + result);
            count++;
          } else if (operator.equals("-")) {
            result = oneN - twoN;
            System.out.println(oneN + " - " + twoN + " = " + result);
            count++;
          }

        }
        System.out.println("-----------------");
      }
    }
  }

  public static int market() {

    return 0;
  }

  public static int bank() {

    return 0;
  }

}
