import java.util.Scanner;

public class Code20 {
    public static void main( String[] args ){
        // 练习题（1）：

        // 1. 接收用户输入的一个数字，判断其是奇数还是偶数
        Scanner s1 = new Scanner(System.in);
        // 创建类对象

        System.out.print("请输入一个数字：");
        // 输出提示语

        int num = s1.nextInt();
        // 接受用户输入

        if(num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
        // 进行判断并输出


        System.out.println("\n-----------------------------------------------------\n");


        // 2. 输出20的阶乘
        long sum = 1;
        for(int i = 1; i <= 20; i++){
            sum *= i;
        }
        System.out.println("20的阶乘是：" + sum);


        System.out.println("\n-----------------------------------------------------\n");


        // 3. 输出1! + 2! + 3! + ... + 20!的结果
        long sum2 = 1;
        long sum3 = 0;
        for(int i = 1; i <= 20; i++) {
            sum2 = 1;
            for (int j = 1; j <= i; j++) {
                sum2 *= j;
            }
            sum3 += sum2;
        }
        System.out.println("1! + 2! + 3! + ... + 20!的结果是：" + sum3);


        System.out.println("\n-----------------------------------------------------\n");


        // 4. 让用户输入a b c三个数，让a b c以从小到大的顺序输出
        Scanner s2 = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = s2.nextInt();
        System.out.print("请输入第二个数：");
        int b = s2.nextInt();
        System.out.print("请输入第三个数：");
        int c = s2.nextInt();

        int temp;

        if(a > b){
            if(a > c){
                temp = a;
                a = c;
                c = temp;
            }else{
                temp = a;
                a = b;
                b = temp;
            }
        }else{
            if(b > c){
                temp = b;
                b = c;
                c = temp;
            }else{
                temp = b;
                b = a;
                a = temp;
            }
        }

        System.out.println("以从小到大的顺序输出：" + a + " < " + b + " < " + c);
    }
}
