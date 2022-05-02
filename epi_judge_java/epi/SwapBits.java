package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class SwapBits { //문제 4.2 비트 스왑
  @EpiTest(testDataFile = "swap_bits.tsv")
  public static long swapBits(long x, int i, int j) {
    if(((x>>>i)&1)!=((x>>>j)&1)){
      long bitMask = (1L << i) | (1L << j);
      x ^= bitMask;
    }
    return x;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SwapBits.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
