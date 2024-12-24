package com.example.demos.stack;

/**
 * EscapeAnalysisTest
 * 注：前端编译阶段看不到效果
 *
 * 逃逸分析--- 逃逸分析出现在JIT阶段，即执行引擎优化时，会根据逃逸分析的结果，决定是否在堆上分配对象，还是直接在栈上分配对象
 * <p>
 * Created on: 2024/12/24
 *
 * @author lijian
 */
public class EscapeAnalysisTest {


    public static void main(String[] args) {
        noEscape();
        User escape = escape();
        System.out.println(escape.getName());
    }

    /**
     * 未逃逸，栈上分配，如果进一步进行`标量替换`，直接分配在栈帧的局部变量表中
     * 何时会采用标量替换呢？
     * 1.对象引用是基本类型，比如int，long，float，double等
     * 2.对象引用是final的，比如String，Integer等
     * 3.对象引用是final的，并且对象没有被修改
     */
    public static void noEscape() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        User user = new User("lijian", 18);
        System.out.println(user.getName());
    }

    /**
     * 逃逸，堆上分配
     *
     * @return user
     */
    public static User escape() {
        int a = 4;
        int b = 5;
        System.out.println(a + b);
        User user = new User("lijian", 20);
        return user;
    }

    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

