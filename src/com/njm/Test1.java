package com.njm;

import java.util.*;

/**
 * 作者：jiamingNi
 * 时间：2022/6/25-06-25-22:55
 * description:com.njm
 * version:1.0
 */
public  class Test1 extends  Test implements TestInterface{
    public static void main(String[] args) {
        Date date = new Date();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Date date1 = new Date();
        String s;


    }
    void getYou(){
        this.value = 1;
    }
    public  static void add1(){
       // Thread thread = new Thread(kh);
        int[] arr1 = new int []{1,2,3};
        for (Object o : arr1) {
            System.out.println("arr1 = " + o);
        }
        int[] arr2 =Arrays.copyOf(arr1, 2);//new Integer[]{1,2}
        List arrayList =  Arrays.asList(new Integer[]{1,2});//传入arr2时false，为基本数据类型，导致arraylist的tostring时调用也为object的tostring
        Collection collection = new ArrayList();
        collection.addAll(arrayList);
        for (Object o : collection) {

            System.out.println(o);
        }
        System.out.println("ArrayscopyOf(arr1,4) = " + collection);
        Collection col2 = new ArrayList();
        col2.add(1);
        col2.add(2);
        Collection col3 = new ArrayList();
        col3.add(1);
        col3.add(2);
        System.out.println(collection.equals(col2));
        System.out.println(col2.toString());
        Date date = new Date();
        Arrays.toString(arr1);
        System.out.println(Math.random());
        StringBuilder b = new StringBuilder();
        arr1.hashCode();
    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}
