package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class ReverseBits { // 문제 4.3 비트 뒤집기(Reverse bits)
  @EpiTest(testDataFile = "reverse_bits.tsv")
  public static long reverseBits(long x) {
    for(int i = 0; i<=31; i++){
      if(((x>>>i)&1)!=((x>>>(63-i))&1)){ // 1
        long bitMask = (1L << i) | (1L << (63-i));  // 2
        x ^= bitMask;  // 3
      }
    }
    return x;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "ReverseBits.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
