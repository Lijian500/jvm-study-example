package com.example.demos.classLoader;

/**
 * ClassHalfInitTest
 * <p>
 * 对象的半初始化问题：
 * Java 对象初始化过程中，某些字段或状态未完全初始化，而被其他线程或代码访问，
 * 导致使用了未完全初始化的对象。这种情况通常与 类加载过程 和 多线程环境 相关。
 * Created on: 2024/12/24
 *
 * @author lijian
 */
public class ClassHalfInitTest {

    // 类加载的paper阶段，静态变量都被初始化，在类加载的init阶段，
    // 静态变量、静态代码块按照在代码中的顺序依次执行 静态变量，在类加载时初始化，但未完全初始化，可能还未被赋值
    private static ClassHalfInitTest instance = new ClassHalfInitTest();

    private static int count = 50; // 静态变量，在类加载时初始化，但未完全初始化，可能还未被赋值, 使用final可以保证赋值

    public ClassHalfInitTest() {
        System.out.println("ClassHalfInitTest init:" + count);
    }

    public static void main(String[] args) {
        ClassHalfInitTest instance1 = ClassHalfInitTest.instance;
        System.out.println(instance1);
    }
}
