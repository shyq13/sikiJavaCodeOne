import java.util.Random;
import java.util.Scanner;

public class Code26 {
    public static void main(String[] args){
        // 练习题：生成随机数组成验证码，让用户输入，输入正确退出程序，输入错误5次切换验证码

        // 1. 导入包
        // 导入Random类
        // 2. 创建Random对象
        Random r = new Random();

        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);
        int n3 = r.nextInt(10);
        int n4 = r.nextInt(10);
        // 生成0-9之间的随机数
        String code = "" + n1 + n2 + n3 + n4;
        // 利用字符串拼接的方式，生成验证码
        System.out.println("验证码：" + code);

        int count = 1;

        while(true) {
            if(count <= 5) {
                System.out.print("请输入验证码：");
                Scanner s1 = new Scanner(System.in);
                String input = s1.nextLine();
                if (input.equals(code)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                    count++;
                }
            }else{
                System.out.println("已连续输入错误5次，即将切换验证码");
                System.out.println("-----------------------------------------------------");
                n1 = r.nextInt(10);
                n2 = r.nextInt(10);
                n3 = r.nextInt(10);
                n4 = r.nextInt(10);
                code = "" + n1 + n2 + n3 + n4;
                System.out.println("验证码：" + code);
                count = 1;
            }
        }
        System.out.println("登录成功！");
    }
}
