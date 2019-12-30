package com.nihui.maven.test;

/**
 * @Classname CallName
 * @Description TODO
 * @Date 2019/12/30 7:18 PM
 * @Created by nihui
 */
public class CallName {
    private String name;

    public CallName(String name) {
        this.name = name;
    }

    public void call(){
        System.out.println("call "+name);
    }
}
