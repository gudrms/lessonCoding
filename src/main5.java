import java.util.Scanner;

public class main5 {
  public static void main(String[] args) {
   int result = moneyAdd();

  }

  public static int foodAdd(){
    Scanner sc = new Scanner(System.in);
    //System.out.println("음식의 가격을 선택하시오\n1.떡볶이\n2.우동\n3.과자\n4.00\n5.00");
    System.out.println("첫번째 음식을 입력하세요");
    String food1 = sc.next();
    System.out.println("첫번째 음식의 가격을 추가하세요");
    int price1 = sc.nextInt();
    System.out.println("두번째 음식을 입력하세요");
    String food2 = sc.next();
    System.out.println("두번째 음식의 가격을 추가하세요");
    int price2 = sc.nextInt();
    System.out.println("세번째 음식을 입력하세요");
    String food3 = sc.next();
    System.out.println("세번째 음식의 가격을 추가하세요");
    int price3 = sc.nextInt();
    System.out.println("네번째 음식을 입력하세요");
    String food4 = sc.next();
    System.out.println("네번째 음식의 가격을 추가하세요");
    int price4 = sc.nextInt();
    System.out.println("다섯번째 음식을 입력하세요");
    String food5 = sc.next();
    System.out.println("다섯번째 음식의 가격을 추가하세요");
    int price5 = sc.nextInt();
    order();

    return 0;
  }
  public static int moneyAdd(){
    Scanner sc = new Scanner(System.in);
    int nowMoney = 10000;
    System.out.println("추가 용돈을 입력하세요");
    int plus = sc.nextInt();
    nowMoney = nowMoney+plus;
    System.out.println("현재 금액은" + nowMoney + "원 입니다.");
    foodAdd();

    return 0;
  }

  public static int order(){
    Scanner sc = new Scanner(System.in);
    System.out.println(food1+"를 몇개 주문하시겠습니까?");
    int food1N = sc.nextInt();

    if (nowMoney >= food1 * food1N) {
      nowMoney = money - dd * ddNum;
      System.out.println("떡볶이는 " + dd * ddNum + "원이고 남은 금액은" + nowMoney + "원 입니다.");
      System.out.println("우동을 몇개 주문하시겠습니까?");
      int udongNum = sc.nextInt();
      if (nowMoney >= udongNum * udong) {
        System.out.println("우동은 " + udongNum * udong + "원이고 남은 금액은" + (nowMoney - udongNum * udong) + "원 입니다.");
        nowMoney = nowMoney - udongNum * udong;
        System.out.println("과자를 몇개 주문하시겠습니까?");
        int snekNum = sc.nextInt();
        if (nowMoney >= snekNum * snek) {
          System.out.println("과자는 " + snekNum * snek + "원이고 남은 금액은" + (nowMoney - snekNum * snek) + "원 입니다.");
          nowMoney = nowMoney - snekNum * snek;
        }


    return 0;
  }
  public static int moneyMinus(){
    Scanner sc = new Scanner(System.in);

    return 0;
  }
  public static int run(){
    Scanner sc = new Scanner(System.in);

    return 0;
  }

}
/*

 1. 음식과 금액 입력.
 2. 용돈 받기
 3. 주문 받기
 4. 용돈에서 주문 금액 빼기
 5. 가게에서 나가기
 */
