//name of branch:: "java-overrideTwo"
//link to problem:: https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?h_r=internal-search
package com.hackerrank.practices.JavaMethodOverridingTwo;
import java.util.*;
import java.io.*;

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotoCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }


    MotoCycle() {
        System.out.println("Hello I am a motorcycle, I am " +define_me());

        String temp=define_me(); //Fix this line


        System.out.println("My ancestor is a cycle who is "+super.define_me());
    }
}

public class Solution {
    public static void main(String[] args) {
        MotoCycle M = new MotoCycle();
    }
}

//TODO::
// Needs::
//   - class: BiCycle
//      -- pass it a string "define_me()" and return "a vehicle with pedals."
//   - class: MotorCycle extend above class
//      --
//        When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.
//
//        You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
//
//        Hello I am a motorcycle, I am a cycle with an engine.
//        My ancestor is a cycle who is a vehicle with pedals.

