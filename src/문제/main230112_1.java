package 문제;

/*

총 ?개의 값을 받게 된다.
    그리고 출력은 거꾸로 출력되게 만들어주세요.
    거꾸로 출력이 완료되었다면,[그 후]
    이번에는 입력 받은 값의 합을 나타내시고,
    혹시라도 7이라는 숫자를 입력한 적이 있다면, 해당 7이라는 숫자가 몇 번이나 나왔는지,
    7이 총 3번 이상 입력받지 않았다면, 7을 입력을 더 받아야 합니다. 라는 문구와 함께 5번의 기회가 더 주어진다.
    해당 7이라는 숫자가 들어있는 배열[거꾸로 배열 기준]의 인덱스 중 중간(짝수의 경우 반올림기준) 몇 번인지를
    나타내시고,
    7이 나온 수만큼 더해진 값이 얼마인지 나타내보세요.

    예시)

    입력 1 2 3 4 5 6 7 7 8 9 10

    [거꾸로]10 9 8 7 7 7 5 4 3 2 1

    총 합은 62입니다.

    7은 총 2번 나왔습니다.

    7이 들어있는 index 중에서 중간에 위치한 index는 ?번 입니다.

    7이 나온 값만큼 더한 숫자는 14입니다.


    거꾸로..
*/


import java.util.Scanner;

public class main230112_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int num = 0;
    int inNum = 0;
    int tt=0;

    System.out.println("몇 개의 수를 받으시겠습니까? ");
    num = sc.nextInt();
    int[] in = new int[num];
    int[] trun = new int[num];
    int tmp = 0;


    for (int i = 0; i < num; i++) {
        System.out.println("입력 : ");
        inNum = sc.nextInt();
        in[i] = inNum;
        sum+=inNum;
    }
    System.out.println("test");
    tmp = in[0];
    for (int i = num-1; i >= 1; i--) {
      System.out.println(in[i]);
    }
    in[num-1] = tmp;

    for (int i = 0; i < num-1; i++) {
      System.out.println(in[i]);
    }
    System.out.println("합은 "+ sum);
  }
}
