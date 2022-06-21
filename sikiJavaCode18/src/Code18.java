public class Code18 {
    public static void main( String[] args ){
        // break与continue语句

        // break语句用于终止循环语句
        // break语句可以用于循环语句和switch语句

        // 如：
        int month = 1;
        switch(month){
            case 3:
                System.out.println("现在是春季");
                break;
            case 4:
                System.out.println("现在是春季");
                break;
            case 5:
                System.out.println("现在是春季");
                break;
            case 6:
                System.out.println("现在是夏季");
                break;
            case 7:
                System.out.println("现在是夏季");
                break;
            case 8:
                System.out.println("现在是夏季");
                break;
            case 9:
                System.out.println("现在是秋季");
                break;
            case 10:
                System.out.println("现在是秋季");
                break;
            case 11:
                System.out.println("现在是秋季");
                break;
            case 12:
                System.out.println("现在是冬季");
                break;
            case 1:
                System.out.println("现在是冬季");
                break;
            case 2:
                System.out.println("现在是冬季");
                break;
            default:
                System.out.println("不存在这个月份！");
                break;
        }
        // switch语句中的break语句可以用于终止switch语句，详见sikiJavaProjects中的switch语句讲解


        System.out.println("\n------------------------------------------------\n");


        int i = 1;
        while(true){
            System.out.println("break语句可以用于终止循环语句");
            i++;
            if(i >= 10) {
                System.out.println("循环已经终止");
                break;
            }
        }


        System.out.println("\n------------------------------------------------\n");


        // 拓展：break标签，如下：
        int j,k;
        for(j = 0;j < 10; j++){
            inside:
            // 定义inside标签
            for(k = 0;k < 10; k++) {
                System.out.println("j的值是：" + j + "，k的值是：" + k);
                if (j == 5) {
                    break inside;
                    // 跳出inside标记的循环
                }
            }
        }


        System.out.println("\n------------------------------------------------\n");


        outside:
        for(j = 0;j < 10; j++){
            inside:
            for(k = 0;k < 10; k++) {
                System.out.println("j的值是：" + j + "，k的值是：" + k);
                if (j == 5) {
                    break outside;
                    // 跳出outside标记的循环
                }
            }
        }


        System.out.println("\n------------------------------------------------\n");


        // continue语句用于跳过当前循环的剩余部分，继续下一次循环，例：
        System.out.print("30以内的奇数有：");

        for(int l = 0;l < 30; l++){
            if(l % 2 == 0){
                continue;
                // 跳过当前循环的剩余部分，继续下一次循环
            }
            System.out.print(l + " ");
        }
    }
}
