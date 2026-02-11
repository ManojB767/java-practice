import java.util.*;

//public class Patterns_java_lecture_6 {

// solid rectangle

//    public static void main(String[] args) {
//        int n = 4;
//        int m = 5;
//        //outer loop
//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= m; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
// hollow rectangle
//    public static void main(String[] args) {
//        int n = 4;
//        int m = 5;
//        //outer loop
//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= m; j++) {
//                if(i==1||j==1||i==n||j==m) {
//                    System.out.print("* ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//        System.out.println();
//    //half pyramid
//public static void main(String[] args) {
//        int n = 10;
//        //outer loop
//        for (int i=1;i<=n;i++) {
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//    }    System.out.println();
//}
//
//    }
//  public static void main(String[] args){
//      int n = 5;
//             for(int i=n; i>=1;i--){
//                 for(int j=1;j<=i;j++){
//              System.out.print("*");
//          }
//        System.out.println() ;
//left side edged pyramid
//    public static void main(String[] args) {
//        int n = 4;
//        //outer loop
//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= (n - i); j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//                System.out.println();
//            }
//
//        }
// numbers half pyramid
//
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i=1;i<=n;i++){
//            for(int j=1; j<=(n-i+1);j++){
//                System.out.print(j);
//            }
//            System.out.println();
//    public static void main(String[] args) {
//        int n = 5;
//        int sum;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                sum = i + j;
//                if (sum % 2 == 0) {
//                    System.out.print("1");
//                } else {
//                    System.out.print("0");
//                }
//            }
//          System.out.println();
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=n;i>=1;i--){
//         for (int j =1;j<=i;j++){
//             for(int k=1 ; k<=n; k++){
//                 System.out.print(" ");
//             }
//             System.out.print("*");
//    }
//
//        } System.out.println();
//
//    }
//}
//for(int i=n; i>=1;i--){
//                 for(int j=1;j<=i;j++){
//              System.out.print("*");
//          }
//        System.out.println() ;
public class Patterns_java_lecture_6 {
public static void main(String[] args) {

    for (int i = 1; i <= 5; i++)
    {
        for (int j =1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}}