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
  // 1
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int e = 0; e < nums[i].length; e++){
        if (nums[i][e] == 0) {
          count += 1;
    }}}
    return count;
  }
  //2a
  public static String fill2D(int[][] vals){
    String newStr = "[";
    for (int r = 0; r < vals.length; r++){
      String newSubStr = "[";
      for (int c = 0; c < vals[r].length; c++){
        if (r == c) {
          newSubStr += "3,";
        }
        else {
          newSubStr += "1,";
        }
      }
      newSubStr = newSubStr.substring(0,newSubStr.length()-1) + "],";
      newStr += newSubStr;
    }
    newStr = newStr.substring(0,newStr.length()-1) + "],";
    return newStr;
  }
  //2b



  public static void main(String[] args) {
    //0a
    int[] aa = {2,3,6,11,18,27,38,51,66,83};
    System.out.println("0a - printArray(int[]ary):\n" + printArray(aa) + "\n");
    //0b
    int[][] ba = {{22,10,1,5},{31,41,52},{23,232,0,32323},{1,2,3,4,5,6,7,8,9}};
    System.out.println("0b - printArray(int[][]ary):\n" + printArray(ba) + "\n");
    //1
    int[][] ca = {{1,1,1,1},{0,0,0,0},{0,1,0,10},{1,2,3,4}};
    System.out.println("1 - countZeros2D:\n" + countZeros2D(ca) + " instances of zero \n");
    //2a
    int[][] da = {{0,1,2,3,4},{1,2,2,0,33434},{4,3,2,1},{6,6,6,6}};
    System.out.println("2a - fill2D:\n" + fill2D(da) + "\n");
    //2b

  }
}
