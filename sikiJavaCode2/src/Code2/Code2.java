package Code2;

public class Code2 {
    public static void main(String[] args) {
        // Java基本数据类型

        // 变量
        // 格式：
        // 变量类型 变量名 = 初始化的值;


        // 常见数据类型

        // 1. 整数类型
        // byte short ing long

        // 2. 浮点类型
        // float double

        // 3. 字符类型
        // char

        // 4. 字符串类型
        // 字符串类型属于一个类，属于引用数据类型

        // 5. 布尔类型
        // boolean


        // 类型的存储大小

        // 1. 整型
        // byte -128 ~ 127                                  (1B / 8b)
        // short -32768 ~ 32767                             (2B / 16b)
        // int -2147483648 ~ 2147483647                     (4B / 32b)
        // long -9223372036854775808 ~ 9223372036854775807  (8B / 64b)

        // 2. 浮点型
        // float -3.4e38 ~ 3.4e38             (4B / 32b)
        // double -1.7e308 ~ 1.7e308          (8B / 64b)

        // 3. 布尔类型
        // boolean      (0.125B / 1b)


        // 变量定义的注意事项
        // 1. 变量名不能以数字开头
        // 2. 变量名不能包含空格
        // 3. 变量名不能包含特殊字符
        // 4. 变量名不能包含关键字
        // 5. 变量名不能重复
        // 6. 变量名不能为空
        // 7. 变量名不能大于八位
        // 8. 整型默认为int类型，浮点型默认为double类型，所以定义默认类型除外的某些变量（如long float）
        // 需要在数据后加上类型首字母，如：long d = 10000000000000l;或long d = 10000000000000L;


        // 变量定义，如下：
        byte a = 1;   // 定义一个byte类型的变量a，初始值为1
        short b = 100; // 定义一个short类型的变量b，初始值为100
        int c = 1000; // 定义一个int类型的变量c，初始值为1000
        long d = 30000000000000l; // 定义一个long类型的变量d，初始值为10000

        float e = 3.14f; // 定义一个float类型的变量e，初始值为3.14
        double f = 78.019; // 定义一个double类型的变量f，初始值为78.019

        char g = 'a'; // 定义一个char类型的变量g，初始值为a

        boolean h = true; // 定义一个boolean类型的变量h，初始值为true

        // 访问变量，如下：

        // 整型
        System.out.println("a的值为：" + a);
        System.out.println("b的值为：" + b);
        System.out.println("c的值为：" + c);
        System.out.println("d的值为：" + d);

        // 浮点类型
        System.out.println("e的值为：" + e);
        System.out.println("f的值为：" + f);

        // 字符类型
        System.out.println("g的值为：" + g);

        // 布尔类型
        System.out.println("h的值为：" + h);


        System.out.println("\n-----------------------------------------------------\n");


        // 常量

        // 常量的定义
        // 定义常量只需要加上final关键字即可，如下：
        final double pi = 3.14;   // 定义一个pi常量，值为3.14
        final int three = 3; // 定义一个three常量，值为3
        final boolean isTrue = true; // 定义一个isTrue常量，值为true

        // 常量的访问
        // 常量的访问与变量的访问相同，如下：
        System.out.println("常量pi的值为：" + pi);
        System.out.println("常量three的值为：" + three);
        System.out.println("常量isTrue的值为：" + isTrue);
    }
}
