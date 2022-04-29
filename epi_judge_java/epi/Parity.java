package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class Parity { //4.1 패리티 계산하기
//  @EpiTest(testDataFile = "parity.tsv")
//  public static short parity(long x) { // 무식한 방법
//    int numOfBitOne = 0;
//    short parity = 0;
//    while(x!=0){
//      numOfBitOne += (x&1);
//      x>>>=1;
//    }
//    if(numOfBitOne%2!=0)
//      parity = 1;
//    return parity;
//  }
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    int numOfBitOne = 0;
    short parity = 0;
    while(x!=0){
      numOfBitOne += (x&1);
      x>>>=1;
    }
    if(numOfBitOne%2!=0)
      parity = 1;
    return parity;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "Parity.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
