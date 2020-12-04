package com.company;

public class MakeTriangles {
    public static void triangle1(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle2(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void triangle3(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void triangle4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j > n; j--){
                System.out.println("");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void triangle5(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }


//	1
//	22
//	333
//	4444
//	55555

//	1
//	12
//	123
//	1234
//	12345

//    1
//   12
//  123
// 1234
//12345

//	5
//	44
//	333
//	2222
//	11111
    public static void main(String[] args){
        triangle1(5);
       triangle2(7);
       triangle3(6);
        triangle4(5);
        triangle5(5);
    }
}