//package java.lang;
//
///**
// * String
// * <p>
// * Created on: 2024/12/18
// *
// * @author lijian
// */
//public class IString {
//
//    /*
//      静态变量，在类加载时，会调用初始化代码块, 可以用来验证该类是否被加载到虚拟机中
//     */
//    static {
//        System.out.println("init customer String");
//    }
//
//    public static void main(String[] args) {
////        /*
////            这行代码会报错，因为编译器在解析类名时，会先查找当前包中的类，然后再查找其他包中的类
////            但是当前String类没有split方法。
////            报错属于java文件编译成class的阶段，前端编译中的`语义分析`阶段，还未到类加载阶段。
////         */
////        String[] split = "hello,jvm".split(",");
////
////        for (String s : split) {
////            System.out.println(s);
////        }
//        System.out.println("自定义java类，加载测试");
//    }
//}
