import java.util.Scanner;

/*
        Scanner sc = new Scanner(System.in);
        //sc가 Scanner의 기능을 갖게 만든다.

        System.out.println("이름 입력하세요 ");
        String name = sc.next();

        System.out.println("제 이름은 " + name + "입니다");


        int a = 1;
        int b = 1;

        if (a == 1) {
            System.out.println("a에 1이 들어있습니다.");
        }
        if (a != 1) {
            System.out.println("a에 1이 들어있습니다.");
        }
        if (a <= 1) {
            System.out.println("a에 1이 들어있습니다.");
        }
        if (a == 1 && b == 1) { // a에 1이 들어있고, 그리고, b에도 1이 들어있다.
            System.out.println("a에 1이 들어있습니다.");
        }
        if (a == 1 || b == 1) { // a에 1이 들어있거나, 혹은 b에 1이 들어있거나, 혹은 둘 다 1이 들어있는 경우.
            System.out.println("a에 1이 들어있습니다.");
        }


        SCanner if
        println

 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("첫 번째 사람 이름 : ");
//        String nameA = sc.next();
//        System.out.println("두 번째 사람 이름 : ");
//        String nameB = sc.next();
//        System.out.println("세 번째 사람 이름 : ");
//        String nameC = sc.next();
//
//        System.out.println("각 집까지의 거리 : ");
//        int numA = sc.nextInt(); //500
////        int km = numA;
//        System.out.println("세명의 집을 차례대로 방문하려면 몇km를 걸어야 하는가 : ");
//        int km = sc.nextInt();
//
//        if (km == numA*3) {
//            System.out.println("정답입니다.");
//        }
//
//        if (km != numA*3){
//            System.out.println("오답입니다.");
//            System.out.println("정답은 "+numA*3+" 입니다.");
//        }
//        System.out.println("첫 번째 수를 입력해주세요.");
//        int A = sc.nextInt();
//        System.out.println("두 번째 수를 입력해주세요.");
//        int B = sc.nextInt();
//
//        System.out.println(A+" + "+B+" = ");
//        int C = sc.nextInt();
//        int d = A+B;
//
//        if (C == d) {
//            System.out.println("정답입니다.");
//            System.out.println("1."+ A);
//            System.out.println("2."+ B);
//            System.out.println("어느 수가 더 큽니까?");
//            int r = sc.nextInt();
//            if (r == 1){
//                if (A < B){
//                    System.out.println("오답입니다.");
//                    System.out.println("정답은 2번 입니다.");
//                }
//                if (B < A){
//                    System.out.println("정답입니다.");
//                }
//            }
//            if (r == 2){
//                if (A > B){
//                    System.out.println("오답입니다.");
//                    System.out.println("정답은 1번 입니다.");
//                }
//                if (B > A){
//                    System.out.println("정답입니다.");
//                }
//            }
//        }
//
//        if (C != d) {
//            System.out.println("오답입니다.");
//            System.out.println("정답은 "+d+"입니다");
////        }
//        System.out.println("a를 입력하세요.");
//        int a = sc.nextInt();
//        System.out.println("b를 입력하세요.");
//        int b = sc.nextInt();
//        System.out.println("c를 입력하세요.");
//        int c = sc.nextInt();
//        System.out.println("d를 입력하세요.");
//        int d = sc.nextInt();
//        System.out.println("e를 입력하세요.");
//        int e = sc.nextInt();
//        System.out.println("f를 입력하세요.");
//        int f = sc.nextInt();
//        System.out.println("g를 입력하세요.");
//        int g = sc.nextInt();
//
//
//        if((a < 10000 && a > 5000) && (b>4000 && a!=b) && (d == a + b + c) && (e < (a + b + c)*3) && (f == (a+b+c+d+e)+5000) &&
//                (g == f*2) && ((c==a+b) || (c==a+b-300))
//        ){
//            System.out.println("a는 5000이상, 10000이하의 숫자입니다.\n" +
//                    "\tb는 4000 이상의 숫자가 들어있고, a보다 클 수도 있고, 작을 수도 있습니다.\n" +
//                    "\t단, b가 a보다 크다면 c는 a와 b의 합이고, b가 a보다 작다면 c는 a와 b의 합에서 -300입니다.\n" +
//                    "\td는 a와 b와 c를 합친 수이지만, e는 a와 b와 c를 합친 수에서 세 배보다 작습니다.\n" +
//                    "\tf는 나머지 a,b,c,d,e를 합친 숫자보다 5000이 더 큽니다. g는 f의 두 배입니다.");
//        }
//
//        if(!(a < 10000 && a > 5000) && (b>4000 && a!=b) && (d == a + b + c) && (e < (a + b + c)*3) && (f == (a+b+c+d+e)+5000) &&
//                (g == f*2) && ((c==a+b) || (c==a+b-300)))  {
//            System.out.println("모두 잘못되었습니다");
//        }
//
//
//        //이 조건이 맞기 때문에 실행이 된거 같은데 어느 부분이 맞는 것인지 모르겠습니다.
//        if(!((a < 10000 && a > 5000) || (b>4000 && a!=b) || (d == a + b + c) || (e < (a + b + c)*3) || (f == (a+b+c+d+e)+5000) ||
//                (g == f*2) || ((c==a+b) || (c==a +b-300)))) {
//
//            if (!(a < 10000 && a > 5000)) {
//                System.out.print("a가 ");
//                System.out.println("test1");
//            }
//            if (!(b > 4000 && a != b)) {
//                System.out.print("b가 ");
//                System.out.println("test2");
//            }
//            if (b > a) {
//                if (c != a + b) {
//                    System.out.print("c가 ");
//                    System.out.println("test3");
//                }
//                System.out.println("test4");
//                c = a + b;
//            }
//
//            if (b < a) {
//                if (c != a + b - 300) {
//                    System.out.print("c가 ");
//                    System.out.println("test5");
//                }
//                c = a + b - 300;
//
//            }
//            if (!(d == a + b + c)) {
//                System.out.print("d가 ");
//                System.out.println("test6");
//            }
//            if (!(e < (a + b + c) * 3)) {
//                System.out.print("e가 ");
//                System.out.println("test7");
//            }
//            if (!(f == (a + b + c + d + e) + 5000)) {
//                System.out.print("f가 ");
//                System.out.println("test8");
//            }
//            if (!(g == f * 2)) {
//                System.out.print("g가 ");
//                System.out.println("test9");
//            }
//            System.out.println("잘못되었습니다");
//
//        }
//        sc.close();           음식을 선택하는 기능.


        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1.감자 2.옥수수 3.수박");
        int n = sc.nextInt();
        int c = 1000;
        int nm = 0;
        int nn = 0;
        int r = 0;

        if (n == 1) {
            System.out.println("1번 감자를 선택하셨습니다.");
            System.out.println(c + "원어치, " + c * 2 + "원어치, " + c * 3 + "원어치");
            nn = sc.nextInt();
            if (nn == 1) {
                System.out.println("감자 1천원어치를 선택하셨습니다");
            }
            if (nn == 2) {
                System.out.println("감자 2천원어치를 선택하셨습니다");
            }
            if (nn == 3) {
                System.out.println("감자 3천원어치를 선택하셨습니다");
            }
//            System.out.println("몇개를 주문 하시겠습니까?");
//            int n1 = sc.nextInt();
//            int r = 0;
//            if (n1 > 0) {
//                System.out.println(r = n1 * nn * 1000);
//            }
        }
        if (n == 2) {
            System.out.println("2번 옥수수를 선택하셨습니다.");
            System.out.println(c * 4 + "원어치, " + c * 5 + "원어치, " + c * 6 + "원어치, ");
            nn = sc.nextInt();
            if (nn == 1) {
                System.out.println("옥수수 4천원어치를 선택하셨습니다");
            }
            if (nn == 2) {
                System.out.println("옥수수 5천원어치를 선택하셨습니다");
            }
            if (nn == 3) {
                System.out.println("옥수수 6천원어치를 선택하셨습니다");
            }
//            System.out.println("몇개를 주문 하시겠습니까?");
//            int n2 = sc.nextInt();
//            int r1 = 0;
//            if (n2 > 0) {
//                System.out.println(r1 = n2 * (nn + 3) * 1000);
//            }
        }
        if (n == 3) {
            System.out.println("3번 수박을 선택하셨습니다.");
            System.out.println(c * 10 + "원어치, " + c * 20 + "원어치, " + c * 30 + "원어치, ");
            nn = sc.nextInt();
            if (nn == 1) {
                System.out.println("수박 만원어치를 선택하셨습니다");
            }
            if (nn == 2) {
                System.out.println("감자 이만원어치를 선택하셨습니다");
            }
            if (nn == 3) {
                System.out.println("감자 3만원어치를 선택하셨습니다");
            }
//                System.out.println("몇개를 주문 하시겠습니까?");
//                int n3 = sc.nextInt();
//                int r2 = 0;
//                if (n3 > 0) {
//                    System.out.println(r2 = n3 * nn * 10000);
//                }

        }
        System.out.println("몇개를 주문 하시겠습니까?");
        int n3 = sc.nextInt();
        if (n == 1) {
            System.out.println(r = n3 * nn * 1000);
        }
        if (n == 2) {
            System.out.println(r = n3 * (nn + 3) * 1000);
        }
        if (n == 3) {
            System.out.println(r = n3 * nn * 10000);
        }

        int x=1,y=2;
        int reslut = add(x,y);
        System.out.println(reslut);
    }
// 음식 선택, 가격출력, 갯수 선택
    public static int add(int x, int y) {
        return x + y;
    }

    public static int select(int s){
        Scanner sc = new Scanner(System.in);
        String a = "감자";
        String b = "옥수수";
        String c = "수박";


        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1."+a+", 2."+b+", 3."+c);
        s = sc.nextInt();
        if(s==1){
            System.out.println(s+"번 "+a+"를 선택하셨습니다.");
        }
        if(s==2){
            System.out.println(s+"번"+ b+"를 선택하셨습니다.");
        }
        if(s==3){
            System.out.println(s+"번"+ c+"를 선택하셨습니다.");
        }
        return s;
    }

    public static int price(int s){
        Scanner sc = new Scanner(System.in);
        String a = "감자";
        String b = "옥수수";
        String c = "수박";
        int p1 = 0;

        int c2 = 1000;
        int nn = 0;
       if(s == 1){
           System.out.println(c2 + "원어치, " + c2 *2+ "원어치, " + c2 * 3 + "원어치, ");

           nn = sc.nextInt();
           if (nn == 1) {
               System.out.println(a+" 천원어치를 선택하셨습니다");
           }
           if (nn == 2) {
               System.out.println(a+" 이천원어치를 선택하셨습니다");
           }
           if (nn == 3) {
               System.out.println(a+" 삼천원어치를 선택하셨습니다");
           }
           p1 = nn * c2;
       }
        if(s == 2){
            System.out.println(c2 +3000+ "원어치, " + c2 *2+3000+ "원어치, " + c2 * 3+3000 + "원어치, ");
            nn = sc.nextInt();
            if (nn == 1) {
                System.out.println(b+" 사원어치를 선택하셨습니다");
                p1 = nn * c2+3000;
            }
            if (nn == 2) {
                System.out.println(b+" 오원어치를 선택하셨습니다");
                p1 = nn * c2+3000;
            }
            if (nn == 3) {
                System.out.println(b+" 육천원어치를 선택하셨습니다");
                p1 = nn * c2+3000;
            }
        }
        if(s == 3){
            System.out.println(c2 *10+ "원어치, " + c2 *20+ "원어치, " + c2 *30 + "원어치, ");
            nn = sc.nextInt();
            if (nn == 1) {
                System.out.println(c+" 만원어치를 선택하셨습니다");
            }
            if (nn == 2) {
                System.out.println(c+" 이만원어치를 선택하셨습니다");
            }
            if (nn == 3) {
                System.out.println(c+" 삼만원어치를 선택하셨습니다");
            }
            p1 = nn*c2*10;
        }

        return p1;
    }
    public static int cost(int p1){
        Scanner sc = new Scanner(System.in);
        int p2 = 0;

        System.out.println("몇개를 주문 하시겠습니까?");
        int n = sc.nextInt();
        System.out.println(p2 = n * p1);

        return p2;
    }


}























































