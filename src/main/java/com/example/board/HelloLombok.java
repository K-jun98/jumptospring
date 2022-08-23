package com.example.board;

import lombok.Getter;


@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    public HelloLombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로",5123123);
        System.out.println(helloLombok.getLombok());
    }

}
