package com.example.demo.test;

public class Test {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    public static void method1(){
        ok:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.println("i="+i+",j="+j);
                if(j==5){
                    break ok;//跳到循环外的ok出，即终止整个循环
                }
            }
        }
    }

    public static void method2(){
        int[][] arr = {{1,2,3},{4,5,6,7},{9}};
        boolean found = false;
        for(int i=0;i<arr.length && !found;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("i="+i+",j="+j+",arr[i][j]:"+arr[i][j]);
                if(arr[i][j]==5){
                    found = true;//找到5，使外层循环判断条件变为false则终止整个循环
                    break;//跳出当前循环
                }
            }
        }
    }

}
