package com.example.demos.classLoader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * ClassLoaderTest
 * <p>
 * Created on: 2024/12/18
 *
 * @author lijian
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        /*
          BootstrapClassLoader =》 启动类加载器
          ExtClassLoader =》 扩展类加载器
          AppClassLoader =》 应用类加载器
          ...
          用户自定义加载器
         */
//        printClassLoader();
//
//        printClassLoaderLoadPath();
    }

    private static void printClassLoaderLoadPath() {
        // 引导类/系统类加载器加载的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        System.out.println("------------------------------------------");

        String property = System.getProperty("java.ext.dirs");
        String[] split = property.split(";");
        for (String s : split) {
            System.out.println(s);
        }

        System.out.println("------------------------------------------");
        String property1 = System.getProperty("java.class.path");
        String[] split1 = property1.split(";");
        for (String s : split1) {
            System.out.println(s);
        }
    }

    private static void printClassLoader() {
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
