import java.util.Scanner;
import java.lang.Math;
// 随机生成数字使用Math包

public class Code22 {
    public static void main(String[] args) {
        // 复习题（3）

        // 9. 猜数字问题：
        // 由于需要生成随机数字，所以需要先提前导入Math包
        int inputNum;
        Scanner s1 = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        // 由于生成的数字是double类型，所以需要强制转化为int类型

        while (true) {
            System.out.print("请输入一个0 - 100的整数：");
            inputNum = s1.nextInt();
            if (inputNum == randomNum) {
                System.out.println("恭喜你猜中了！");
                break;
            } else if (inputNum > randomNum) {
                System.out.println("你猜的数字大了！");
            }else{
                System.out.println("你猜的数字小了！");
            }

            System.out.println("\n------------------------------------------\n");
        }
    }
}
