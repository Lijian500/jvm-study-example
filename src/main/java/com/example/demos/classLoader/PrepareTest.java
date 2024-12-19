package com.example.demos.classLoader;

/**
 * PrepareTest
 * <p>
 * Created on: 2024/12/19
 *
 * @author lijian
 */
public class PrepareTest {

    // `链接-准备`阶段, 会为静态变量分配内存空间，并设置默认值。此处 i = 0, 初始化阶段会设置 i = 100.
    private static int i = 100;

    // final 修饰的变量，在编译阶段会直接赋值，不会在初始化阶段进行赋值。此处 a = 100.
    private final static int a = 100;

    public static void main(String[] args) {
        System.out.println(i + a);
    }
}
