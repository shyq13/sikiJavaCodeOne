package Code6;

public class Code6 {
    public static void main(String[] args) {
        // 赋值运算符

        // 常用的赋值运算符：
        // = 赋值运算符
        // += 加法赋值运算符
        // -= 减法赋值运算符
        // *= 乘法赋值运算符
        // /= 除法赋值运算符
        // %= 求余赋值运算符

        // 用法：
        // 变量 X= 值;   （X可以是任意的算术运算符）
        // 上面的算式就相当于：变量 = 变量 X 值;
        // 例：
        int a = 1;
        int b = 2;
        b += a;
        System.out.println("a和b相加的值是" + b);

        int c = 3;
        c *= 2;
        System.out.println("c乘2的值是" + c);

        int d = 4;
        d /= 2;
        System.out.println("d除以2的值是" + d);

        int e = 5;
        e %= 2;
        System.out.println("e除以2的余数是" + e);

        // 当然，还可以这样赋值（不推荐）：
        int x, y, z;
        x = y = z = 4;
        System.out.println("x,y,z的值分别是" + x + "," + y + "," + z);
    }
}
