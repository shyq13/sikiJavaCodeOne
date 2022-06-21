import java.util.Scanner;
public class Code19 {
    public static void main(String[] args) {
        // 接收用户输入内容

        // 步骤：
        // 1. 导入 Scanner 类
        // 2. 创建 Scanner 对象
        // 3. 调用 nextLine() 方法接收用户输入内容

        // 示例：

        // 导入类详见第一行

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        // 创建Scanner对象

        System.out.print("请输入一个字符串：");
        // 输出提示语

        String a = s.nextLine();

        System.out.print("请输入一个数字：");

        int b = s.nextInt();

        // 接收用户输入的内容
        // 输入字符串就选择 nextLine()，输入数字就选择 nextInt()

        System.out.println("用户输入的字符串是\"" + a + "\"");
        // 输出用户输入的字符串
        System.out.println("用户输入的数字是" + b);
        // 输出用户输入的数字
        // 输出用户输入的内容


        System.out.println("\n-------------------------------------------\n");


        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.print("请输入第一个加数：");
        int num1 = s2.nextInt();

        System.out.print("请输入第二个加数：");
        int num2 = s3.nextInt();

        System.out.println("两个加数的和是：" + (num1 + num2));
    }
}
