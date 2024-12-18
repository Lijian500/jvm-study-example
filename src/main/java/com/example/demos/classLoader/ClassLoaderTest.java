package com.example.demos.classLoader;

/**
 * ClassLoaderTest
 * <p>
 * Created on: 2024/12/18
 *
 * @author lijian
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // 自定义的类默认都是使用系统类加载器/应用类加载器 加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        // 获取父类加载器 =》 扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        // 获取父类加载器 =》 引导加载器 =》 null
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // String 是由引导类加载器加载的，BootstrapClassLoader是由C语言实现的,所有获取到是null
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }





}
