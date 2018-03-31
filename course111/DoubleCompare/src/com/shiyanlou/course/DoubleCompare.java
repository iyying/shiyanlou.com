package com.shiyanlou.course;

public class DoubleCompare {
    public static void main(String[] args) {
        String s_1 = "123.321";
        String s_2 = "567.765";
//显然，这里的123.321和567.765都不是数值，而是“一句话”
//你也可以自定义这些数字

        Double num_1 = Double.parseDouble(s_1);
        Double num_2 = Double.parseDouble(s_2);
//定义了Double类型的数据，并将字符串转换为双精度浮点数赋予其值

        System.out.println("number 1: " + num_1);
        System.out.println("number 2: " + num_2);

        switch (num_1.compareTo(num_2)) {
            case -1:
                System.out.println("number 1 is smaller than number 2");
                break;
            case 0:
                System.out.println("number 1 is equal to number 2");
                break;
            case 1:
                System.out.println("number 1 is bigger than number 2");
                break;
        }
    }
}
