public class ArrayDemo {
// 0a, 0b
  public static void printArray(int[]ary){
    String finStr = "[";
    for (int i = 0; i < ary.length; i++) {
      finStr += ary[i] + ", ";
    }
    finStr = finStr.substring(0,finStr.length()-2) + "]";
    System.out.print(finStr);
  }
  //public static void printArray(int[][]ary){}

  public static void main(String[] args) {
    // 0a
    int[] a = new int [10];
    for (int i = 0; i < a.length;i++) {
      a[i] = i * i + 2;
    }
    printArray(a);

  }
}
