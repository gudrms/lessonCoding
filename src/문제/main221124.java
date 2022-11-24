package 문제;

public class main221124 {
  public static void main(String[] args) {
    int a = 1;
    int b = 11;

    while (a <= 2) {
      System.out.println("a = " + a);
      a++;
      b=11;
      while (b <= 20) {
        System.out.println("b = " + b);
        b++;
      }
    }
    System.out.println();
    System.out.println();

    //;;세미콜론 두 개는 무조건 존재해야함. 선언식, 조건식, 증감식
    for (;;a++) {
      System.out.println("a = " + a);
      for (b = 11; b <= 20; b++) {
        System.out.println("b = " + b);
      }
    }

  }
}
