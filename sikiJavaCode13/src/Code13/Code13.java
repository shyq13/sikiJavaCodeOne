package Code13;

public class Code13 {
    public static void main( String[] args ){
        // switch语句

        // switch语句的写法：
        /*
        switch(表达式){
            case 值1:
                语句块1;
                break;
            case 值2:
                语句块2;
                break;
            case 值3:
                语句块3;
                break;
            ……
            default:
                break;
         */
        // 例：
        int a = 3;

        switch(a) {
            case 1:
                System.out.println("a的值是1");
                break;
            case 2:
                System.out.println("a的值是2");
                break;
            case 3:
                System.out.println("a的值是3");
                break;
            default:
                System.out.println("a的值不是1、2、3");
                break;
        }
        // 输出：a的值是3


        System.out.println("\n-----------------------------------------------------\n");


        // 但是注意：一定要在switch语句的最后加上break语句！如果不加，就会出现下面的情况：
        a = 1;
        switch(a){
            case 1:
                System.out.println("我是第一条语句");
            case 2:
                System.out.println("我是第二条语句");
            case 3:
                System.out.println("我是第三条语句");
            case 4:
                System.out.println("我是第四条语句");
            default:
                System.out.println("我是最后一条语句");
        }
        // 输出结果：我是第一条语句
        //         我是第二条语句
        //         我是第三条语句
        //         我是第四条语句
        //         我是最后一条语句


        System.out.println("\n-----------------------------------------------------\n");


        // 同样，还可以判断字符串
        String url = "https://www.bilibili.com";
        switch(url) {
            case "https://www.baidu.com":
                System.out.println("https://www.baidu.com");
                break;
            case "https://www.google.com":
                System.out.println("https://www.google.com");
                break;
            case "https://www.sina.com":
                System.out.println("https://www.sina.com");
                break;
            case "https://www.bilibili.com":
                System.out.println("https://www.bilibili.com");
                break;
            default:
                System.out.println("没有接入这个网站，请重新输入：");
                break;
        }
        // 注意：case语句后必须要是常量！
    }
}
