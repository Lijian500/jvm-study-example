package com.example.demos.classLoader;

/**
 * MultipleConstructorsTest
 * <p>
 * Created on: 2024/12/19
 *
 * @author lijian
 */
public class MultipleConstructorsTest {

    private String name;

    private String address;


    // init方法
    public MultipleConstructorsTest() {
    }


    // init方法
    public MultipleConstructorsTest(String name) {
        this.name = name;
    }


    // init方法
    public MultipleConstructorsTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
