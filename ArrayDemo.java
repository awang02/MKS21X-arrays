public class ArrayDemo {
  // 0a
  public static String printArray(int[]ary){
    String finStr = "[";
    for (int i = 0; i < ary.length; i++) {
      finStr += ary[i] + ",";
    }
    finStr = finStr.substring(0,finStr.length()-1) + "]";
    return finStr;
  }
  //0b
  public static String printArray(int[][]ary){
    String rtn = "[";
    for (int i = 0; i < ary.length; i++) {
      rtn += printArray(ary[i]);
    }
    rtn = rtn + "]";
    return rtn;
  }

  public static void main(String[] args) {
    //0a
    int[] aa = {2,3,6,11,18,27,38,51,66,83}
    System.out.println("0a:\n" + printArray(aa));
    //0b
    int[][] b = {{22,10,1,5},{31,41,52},{23,232,0,32323},{1,2,3,4,5,6,7,8,9}};
    System.out.println("0b:\n" + printArray(b));
  }
}
