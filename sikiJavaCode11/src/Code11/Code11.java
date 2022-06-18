package Code11;

public class Code11 {
    public static void main( String[] args ){
        // 类型转换

        // 类型转换分为两种：隐式转换和显式转换

        // 隐式转换
        byte a = 13;
        short b = a;
        // 此时byte类型的a会隐式转换成short类型并赋值给b
        int c = b;
        // 与上同理

        System.out.println("a的值是" + a + "，b的值是" + b);
        // 输出结果：a的值是：13，b的值是：13

        double d = 'a';
        // 字符转换为ASCII码也属于隐式转换

        System.out.println("字符a的ASCII码是" + d);

        float PI = 3.14f;
        double e = PI * a;
        // 这时PI和a会被隐式转换成double类型，进行运算后并赋值给e
        System.out.println("直径为13的圆的周长是" + e);
        // 输出结果：直径为13的圆的周长是40.81999969482422
        // 由于Java浮点数的精度问题，运算结果可能会有误差

        System.out.println("\n---------------------------------------\n");

        // 显式转换
        // 显式转换只需要在需要转换的值前加上 (类型名) 即可，例：
        int f = (int) 3.3f;
        // 这时3.3f会被显式转换成int类型，并赋值给f
        System.out.println("3.3f转换成int类型后的值是" + f);
        // 输出结果：3.3f转换成int类型后的值是3

        System.out.println("变量e转换成long类型后的值是" + (long) e);
        // 输出结果：变量e转换成long类型后的值是40
        // 由于强制转换浮点数使用的是去尾法，所以变量e转换后是40
    }
}
