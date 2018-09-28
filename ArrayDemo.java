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
    for (int b = 0; b < ary[a].length; b += 1) {
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

public static int countZeros2D(int[][] nums){
  int output = 0;
  for (int a = 0; a < nums.length; a += 1) {
    for (int b = 0; b < nums[a].length; b += 1) {
      if (nums[a][b] == 0) {
        output += 1;
      }
    }
  }
  return output;
}

public static void fill2D(int[][] vals){
  for (int a = 0; a < vals.length; a += 1) {
    for (int b = 0; b < vals[a].length; b += 1) {
      if (vals[a][b] == b) {
        vals[a][b] = 3;
      } else {
        vals[a][b] = 1;
      }
    }
  }
}

public static int[][] fill2DCopy(int[][] vals){
  //makes a new array with the correct length
  int[][] output = new int[vals.length][];
  for (int a = 0; a < vals.length; a += 1) {
    //I didn't know how else to do it. SO, I created a standin.
    int[] stand = new int[vals[a].length];
    for (int b = 0; b < vals[a].length; b += 1) {
      if (vals[a][b] < 0) {
        stand[b] = 3;
      } else {
        stand[b] = 1;
      }
    }
    //dubplicates the copy
      output[a] = stand;
  }
  return output;
}
//test case//
public static void main (String[] args) {
  int[] test0a = new int[10];
  printArray(test0a);
  System.out.print("hi");
  int[][] test0b = new int[10][10];
  printArray(test0b);
}

}
