package Code5;

public class Code5 {
    public static void main( String[] args ){
        // 自增自减运算符

        // 运算符写法
        // 自增运算符：++
        // 自减运算符：--

        // 语法：
        // 变量名++;
        // 变量名--;
        // 或：
        // ++变量名;
        // --变量名;
        // 如：
        int a = 68;
        a++;
        System.out.println("自增后，a的值是" + a);

        int b = 17;
        b--;
        System.out.println("自减后，b的值是" + b);

        int c = 20;
        ++c;
        System.out.println("自增后，c的值是" + c);

        int d = 57;
        --d;
        System.out.println("自减后，d的值是" + d);


        System.out.println("\n-----------------------------------------------------\n");
        a = 68;
        b = 17;
        c = 20;
        d = 57;


        // 注意事项：
        // 前置自增与后置自增、前置自减与后置自减的区别：

        // 前置自增/减：
        // 先进行运算，在执行表达式操作

        // 后置自增/减：
        // 先执行表达式操作，再进行运算

        // 如：
        System.out.println("执行后置自增操作的a的值是" + a++);  // 结果：执行后置自增操作的a的值是68
        System.out.println("执行前置自增操作的b的值是" + ++b);  // 结果：执行前置自增操作的b的值是18
        System.out.println("执行后置自减操作的c的值是" + c--);  // 结果：执行后置自减操作的c的值是20
        System.out.println("执行前置自减操作的d的值是" + --d);  // 结果：执行前置自减操作的d的值是56

        // 即：
        // 第一个表达式的执行顺序：输出a的值；a自增
        // 第二个表达式的执行顺序：b自增；输出b的值
        // 第三个表达式的执行顺序：输出c的值；c自减
        // 第四个表达式的执行顺序：d自减；输出d的值


        System.out.println("\n-----------------------------------------------------\n");
        a = 68;
        b = 17;
        c = 20;
        d = 57;
    }
}
