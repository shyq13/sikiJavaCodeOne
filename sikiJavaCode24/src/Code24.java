/**
    @author shyq13
 */
public class Code24 {
    public static void main(String[] args) {
        // 一些常用的字符串方法

        // 1. 获取字符串长度
        String str1 = "Hello World";
        System.out.println("字符串str1的长度是" + str1.length());
        // 可以使用length()方法获取字符串的长度


        System.out.println("\n-----------------------------------------------------");


        // 2. 获取字符串子字符串的位置
        String str2 = "www.baidu.com";
        System.out.println("字符串\"b\"在str2中的索引是" + str2.indexOf("b"));
        // 可以使用indexOf函数获取子字符串在某个字符串中的位置（仅限一个字母，如有多个字符则取首字母）
        // 注意：indexOf函数是从前向后查找的

        // 如果需要从前向后查找，则可以使用lastIndexOf函数
        String str3 = "www.baidu.com www.google.com";
        System.out.println("字符串\"w\"在str3中的索引是" + str3.lastIndexOf("w"));


        // 注意：indexOf和lastIndexOf都是寻找完整的子字符串，如果找不到，则返回-1


        System.out.println("\n-----------------------------------------------------");


        // 3. 根据索引输出字符
        String str4 = "Hello World";
        System.out.println("字符串str4的第二个字符是" + str4.charAt(1));
        // 可以使用charAt函数获取某个字符串的某个字符


        System.out.println("\n-----------------------------------------------------");


        // 4. 获取子字符串
        String str5 = "www.bing.com";
        System.out.println("字符串str5中截取的一个子字符串是" + str5.substring(9));
        // 括号中的参数是起始位置的索引
        System.out.println("字符串str5中截取出来的子字符串是" + str5.substring(4,8));
        // 使用substring函数截取子字符串，前后两个参数分别为起始位置的参数和结束位置的参数-1
        // 注意：这个函数不会对字符串本身进行修改，只是截取了一个新的字符串返回


        System.out.println("\n-----------------------------------------------------");


        // 5. 判断字符串的开头与结尾
        String str6 = "unityEngineer";
        System.out.println("字符串str6是否以\"unity\"开头：" + str6.startsWith("unity"));
        // 可以使用startsWith函数判断字符串是否以某个字符串开头

        System.out.println("字符串str6是否以\"Engine\"结尾：" + str6.endsWith("Engine"));
        // 可以使用endsWith函数判断字符串是否以某个字符串结尾


        System.out.println("\n-----------------------------------------------------");


        // 6. 判断字符串是否相等
        String str7 = "unityEngineer";
        String str8 = "unityEngineer";
        String str9 = "unrealEngineer";
        System.out.println("字符串str7和str8是否相等：" + str7.equals(str8));

        System.out.println("字符串str7和str9是否相等：" + str7.equals(str9));
        // 可以使用equals函数判断字符串是否相等


        System.out.println("\n-----------------------------------------------------");


        // 7. 判断字符串是否包含某个字符串
        String str10 = "unityEngineer";
        String str11 = "unity";
        String str12 = "engineer";

        System.out.println("字符串str10是否包含字符串str11：" + str10.contains(str11));

        System.out.println("字符串str10是否包含字符串str12：" + str10.contains(str12));
        // 可以使用contains函数判断字符串是否包含某个字符串


        System.out.println("\n-----------------------------------------------------");


        // 8. 判断字符串是否为空
        String str13 = "Hello World";
        String str14 = "";
        String str15 = null;

        System.out.println("字符串str13是否为空：" + str13.isEmpty());
        System.out.println("字符串str14是否为空：" + str14.isEmpty());
        // 可以使用isEmpty函数判断字符串是否为空

        // System.out.println("字符串str15是否为空：" + str15.isEmpty());
        // 由于str15为null，所以会抛出NullPointerException异常


        System.out.println("\n-----------------------------------------------------");


        // 9. 字母大小写转换
        String str16 = "Hello world";
        System.out.println("字符串str16的大写是：" + str16.toUpperCase());
        // 可以使用toUpperCase函数将字符串转换为大写字符串
        System.out.println("字符串str16的小写是：" + str16.toLowerCase());
        // 可以使用toLowerCase函数将字符串转换为小写字符串


        System.out.println("\n-----------------------------------------------------");


        // 10. 字符串分割
        String str17 = "www.baidu.com";

        String[] strArray = str17.split("\\.");
        // 定义一个数组，用于存储分割后的字符串
        // 可以使用split函数将字符串分割为字符串数组，括号里的参数是分割的依据

        System.out.print("分割后的字符串有：");
        for (String temp : strArray) {
            System.out.print("\"" + temp + "\"" + ", ");
        }
        System.out.println();

        System.out.println("\n-----------------------------------------------------");


        // 12. 字符串去空格
        String str18 = "     Hello World     ";

        System.out.println("字符串str18去空格前的字符串是：" + str18);
        System.out.println("字符串str18去空格后的字符串是：" + str18.trim());
        // 可以使用trim函数去除字符串前后的空格（注意：只能去除两段的空格，中间的不能去除）


        System.out.println("\n-----------------------------------------------------");


        // 13. 字符串替换
        String str19 = "Unity World";
        System.out.println("字符串str19替换前的字符串是：" + str19);
        System.out.println("字符串str19替换后的字符串是：" + str19.replace(" World", "Engineer"));
        // 可以使用replace函数替换字符串中的某个字符串为另一个字符串
    }
}
