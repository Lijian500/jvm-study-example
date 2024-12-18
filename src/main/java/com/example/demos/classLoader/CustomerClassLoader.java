package com.example.demos.classLoader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * CustomerClassLoader
 * <p>
 * Created on: 2024/12/18
 *
 * @author lijian
 */
public class CustomerClassLoader extends ClassLoader {


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO: 2024/12/18 16:07 lj 实现自定义的类加载规则

        return super.findClass(name);
    }



    public static class CustomerClassLoader2 extends URLClassLoader{

        public CustomerClassLoader2(URL[] urls, ClassLoader parent) {
            super(urls, parent);
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            return super.findClass(name);
        }
    }

}
