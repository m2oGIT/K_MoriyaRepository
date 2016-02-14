/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test10 {
  public static void main( String[] args ) {
    int kekka = 0;
    kekka = keisan(10, 50);
    System.out.println( "kekka = " + kekka );
  }
    private static int keisan(int Int1, int Int2){
      int sum = 0;
      for ( int i = Int1; i <= Int2; i++ ) {
        sum += i;
        System.out.println( "i = " + i + " / " + "sum = " + sum );
      }
    System.out.println( "sum   = " + sum );
    return sum;
    }
  }
