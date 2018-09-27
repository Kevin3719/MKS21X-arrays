public class ArrayDemo {

public static void printArray(int[] ary){
  String output = "{";
  for (int i = 0; i < ary.length; i += 1) {
    System.out.print("" + ary[i]);
    if (i < ary.length - 1) {
      System.out.print(", ");
    }
  }
}

//test case//
public static void main (String[] args) {
  int[] test0a = new int[10];
  printArray(test0a);
}
}
