package Code10;

public class Code10 {
    public static void main( String[] args ){
        // 三元运算符

        // 常见的三元运算符
        // 三元运算符只有一个：条件 ? 结果1 : 结果2

        // 三元运算符的使用，例：
        // ?:的规则是：如果条件为true，则返回结果1，否则返回结果2，例：

        int a = true ? 1 : 2;
        System.out.println("a的值是" + a);

        int b = false ? 1 : 2;
        System.out.println("b的值是" + b);

        boolean c = 1 <= 2 ? true : false;
        System.out.println("c的值是" + c);

        boolean d = 1 >= 2 ? true : false;
        System.out.println("d的值是" + d);
        // 或者可以直接使用：

        System.out.println(7 < 8 ? "7小于8" : "7大于8");
        // 输出结果：7小于8
    }
}
