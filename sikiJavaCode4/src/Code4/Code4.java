package Code4;

public class Code4 {
    public static void main(String[] args) {
        // 运算符 —— 算术运算符

        // Java中常见的算术运算符
        // + 加法
        // - 减法
        // * 乘法
        // / 除法
        // % 取余


        // 双目运算符操作规则
        // 数据1   运算符   数据2

        // 访问
        // 整型
        int a = 10;
        System.out.println(a * 10);
        System.out.println(10 + 59);

        // 浮点型
        double b = 87.0;
        System.out.println(b * 10);
        System.out.println(17.0 + 59.0);


        System.out.println("\n------------------------------\n");


        // 需要注意的事情

        // 1. 浮点在作运算时的不精确性，如下：
        System.out.println(5.3 - 4.2);
        System.out.println(0.08f + 0.01f);
        System.out.println(6.9 * 7);
        System.out.println(7.6 % 2.0);
        // 为什么呢？
        // 因为两个浮点类型在Java中本身就不是精确存储的，所以在进行运算时，会有一定的误差


        System.out.println("\n------------------------------\n");


        // 2. 字符串拼接
        // 在Java中，字符串可以使用+运算符进行拼接，如：
        System.out.println("1" + "1");
        System.out.println("1" + 2);
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        // 注意以下字符串拼接的区别：
        System.out.println("" + 1 + 1);   // 输出结果：11
        System.out.println(1 + 1 + "");   // 输出结果：2
        System.out.println("" + (1 + 1)); // 输出结果：2


        System.out.println("\n------------------------------\n");


        // 3. 使用字符进行拼接的时候，会使用对应的ASCII码进行算数运算，如：
        System.out.println('a' + 'a');   // 输出结果：194
        System.out.println('1' + ' ');   // 输出结果：81
        System.out.println('(' + 1);     // 输出结果：41
    }
}
