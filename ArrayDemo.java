public class ArrayDemo {

public static void printArray(int[] ary){
  System.out.print("[");
  for (int i = 0; i < ary.length; i += 1) {
    System.out.print("" + ary[i]);
    if (i < ary.length - 1) {
      System.out.print(", ");
    }
  }
  System.out.print("]");
}
public static void printArray(int[][]ary){
  for (int a = 0; a < ary.length; a += 1) {
      System.out.print("[");
    for (int b = 0; b < ary.length; b += 1) {
      System.out.print("" + ary[a][b]);
      if (b < ary.length - 1) {
        System.out.print(", ");
      }
    }
    if (a < ary.length - 1) {
    System.out.print("],");}
  }
  System.out.print("]");
}
//test case//
public static void main (String[] args) {
  int[] test0a = new int[10];
  printArray(test0a);
}
}
