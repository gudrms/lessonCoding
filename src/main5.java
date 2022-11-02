//import java.util.Scanner;
//
//public class main5 {
//  public static void main(String[] args) {
//    /*
//        값에 관련하는 변수들은 모조리 메인에서 관리가 되야 함.
//
//     */
//    int 구구단 = 구구단();
//    int result = moneyAdd();//중국집
//    int 계산기 = 계산기();
//
//  }
//
//  public static int foodAdd(int nowMoney) {
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("첫번째 음식을 입력하세요");
//    String food1 = sc.next();
//    System.out.println("첫번째 음식의 가격을 추가하세요");
//    int price1 = sc.nextInt();
//    System.out.println("두번째 음식을 입력하세요");
//    String food2 = sc.next();
//    System.out.println("두번째 음식의 가격을 추가하세요");
//    int price2 = sc.nextInt();
//    System.out.println("세번째 음식을 입력하세요");
//    String food3 = sc.next();
//    System.out.println("세번째 음식의 가격을 추가하세요");
//    int price3 = sc.nextInt();
//    System.out.println("네번째 음식을 입력하세요");
//    String food4 = sc.next();
//    System.out.println("네번째 음식의 가격을 추가하세요");
//    int price4 = sc.nextInt();
//    System.out.println("다섯번째 음식을 입력하세요");
//    String food5 = sc.next();
//    System.out.println("다섯번째 음식의 가격을 추가하세요");
//    int price5 = sc.nextInt();
//    order(String nowMoney, int food1, String price1,int food2, String price2,int food3, String price3,int food4, String
//    price4,int food5, String price5);
//
//    return 0;
//  }
//
//  public static int moneyAdd() {
//    Scanner sc = new Scanner(System.in);
//    int nowMoney = 10000;
//    System.out.println("추가 용돈을 입력하세요");
//    int plus = sc.nextInt();
//    nowMoney = nowMoney + plus;
//    System.out.println("현재 금액은" + nowMoney + "원 입니다.");
//    return nowMoney;
//    foodAdd(nowMoney);
//
//  }
//
//  public static int order(String nowMoney, int food1, String price1, int food2, String price2, int food3, String price3, int food4, String price4, int food5, String price5) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println(food1 + "를 몇개 주문하시겠습니까?");
//    int food1N = sc.nextInt();
//
//    int food1Num = food1 * food1N;
//    if (nowMoney >= food1Num) {
//      nowMoney = money - dd * ddNum;
//      System.out.println("떡볶이는 " + dd * ddNum + "원이고 남은 금액은" + nowMoney + "원 입니다.");
//      System.out.println("우동을 몇개 주문하시겠습니까?");
//      int udongNum = sc.nextInt();
//      if (nowMoney >= udongNum * udong) {
//        System.out.println("우동은 " + udongNum * udong + "원이고 남은 금액은" + (nowMoney - udongNum * udong) + "원 입니다.");
//        nowMoney = nowMoney - udongNum * udong;
//        System.out.println("과자를 몇개 주문하시겠습니까?");
//        int snekNum = sc.nextInt();
//        if (nowMoney >= snekNum * snek) {
//          System.out.println("과자는 " + snekNum * snek + "원이고 남은 금액은" + (nowMoney - snekNum * snek) + "원 입니다.");
//          nowMoney = nowMoney - snekNum * snek;
//        }
//
//
//        return 0;
//      }
//      public static int moneyMinus () {
//        Scanner sc = new Scanner(System.in);
//
//
//        return 0;
//      }
//      public static int run () {
//        Scanner sc = new Scanner(System.in);
//        if (nowMoney <= food1Num) {
//          System.out.println("용돈이 부족하여 가게에서 쫓겨났습니다.");
//        }
//        return 0;
//      }
//
//    }
//  }
//}
///*
//
// 1. 음식과 금액 입력.
// 2. 용돈 받기
// 3. 주문 받기
// 4. 용돈에서 주문 금액 빼기
// 5. 가게에서 나가기
// */
