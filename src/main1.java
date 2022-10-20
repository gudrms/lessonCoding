import java.util.Scanner;


public class main1 {
    public static void main(String[] args) {
        int total = foodSelect();
        System.out.println("총 합산된 금액은 "+total+"원 입니다.");
    }
    public static int foodSelect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n어떤 음식을 주문하겠습니까.\n1.감자\n2.옥수수\n3.수박");
        int select = sc.nextInt();
        if (select == 1) {
            return foodPriceSelect("감자", 1000, 2000, 3000);
        } else if (select == 2) {
            return foodPriceSelect("옥수수", 4000, 5000, 6000);
        } else if (select == 3) {
            return foodPriceSelect("수박1", 1, 20000, 30000);
        } else if (select == 4) {
            return foodPriceSelect("수박2", 10000, 2, 30000);
        } else if (select == 5) {
            return foodPriceSelect("수박3", 10000, 20000, 3);
        } else if (select == 6) {
            return foodPriceSelect("수박4", 4, 20000, 30000);
        } else if (select == 7) {
            return foodPriceSelect("수박5", 10000, 5, 30000);
        } else if (select == 8) {
            return foodPriceSelect("수박6", 10000, 20000, 6);
        } else if (select == 9) {
            return foodPriceSelect("수박7", 7, 20000, 30000);
        } else if (select == 10) {
            return foodPriceSelect("수박8", 10000, 8, 30000);
        } else if (select == 11) {
            return foodPriceSelect("수박9", 10000, 20000, 9);
        }
        return 0;
    }

    public static int foodPriceSelect(String foodName, int price1, int price2, int price3) {
        Scanner sc = new Scanner(System.in);
        System.out.println(foodName + "을 선택하셨습니다.\n1." + price1 + "원 2." + price2 + "원 3." + price3 + "원\n\n선택 : ");
        int select = sc.nextInt();
        if (select == 1) {
            return foodtotalPrice(foodName, price1);
        } else if (select == 2) {
            return foodtotalPrice(foodName, price2);
        } else if (select == 3) {
            return foodtotalPrice(foodName, price3);
        }
        return 0;
    }

    public static int foodtotalPrice(String foodName, int price) {
        Scanner sc = new Scanner(System.in);
        System.out.println(foodName + "의 개수를 입력하세요 : ");
        int number = sc.nextInt();
        return price * number;
    }

}























































