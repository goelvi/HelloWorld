package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Rect r = new Rect();
        System.out.println("area = " + r.Area(4, 6));

        r.setName("power bank");
        System.out.println(r.getName());

        //        trySomethingElse();
//        tryBoxing();
    }

//    static void tryGenCls() {
//        Shape<Rect> r = new Shape<>();
//        Shape<Circle> c = new Shape<>();
//
//        Rect r1 = new Shape<>();
//
//        r.set(r1);
//
//        System.out.println(r1.Area(2,3));
//    }

    static void tryBoxing() {
        Rect r = new Rect();
        MyBox b = new MyBox();
        b.setMyBox(r);
        r = (Rect) b.getMyBox();

        System.out.println(r.Area(5, 5));
    }

    static void trySomething(){
        int len = 10;

        int[] intArr = new int[len];

        intArr[0] = 1;
        System.out.println(intArr.length);
        //for (int i : intArr){
            //System.out.println(i);
        //}

        ArrayList<String> arrStr = new ArrayList<String>();
        int l;
        for (l = 0; l < 10; l++){
            arrStr.add(l, String.valueOf(l));
        }
        arrStr.add(5, "20");
        String m;
        for (l =0; l < 10; l++){
            m = arrStr.get(l);
            System.out.println(m);
        }
        //arrStr.remove(5);
        // System.out.println("Number 5 is at index " + arrStr.indexOf("5"));
        // System.out.println("Number 20 is part of list or not: " + arrStr.contains("20"));

        Object o = new Object();

        System.out.println(o.hashCode());

    }

    static void trySomethingElse(){
        ArrayList al = new ArrayList();
        int i = 5;
        char c;

        c = 'A';

        al.add(i);
        al.add(c);

        int m = 5;

        try {
            System.out.println(al.get(0) + " " + al.get(m));
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("gotch you");
        }
        System.out.println("Be the force be with you!");
    }
}
