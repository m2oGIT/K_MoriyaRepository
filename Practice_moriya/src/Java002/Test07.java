/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test07 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ
    int sum = 0;
    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
    }
    System.out.println( "sum = " + sum );
  }

  public static int keisan( int Int1, int Int2 ) {
    int sum = 0;
    System.out.println( "Int1 = " + Int1 + "  /  " + "Int2 = " + Int2 );
    for ( int i = Int1; i <= Int2; i++ ) {
      sum += i;
      System.out.println( "i = " + i + " / " + "sum = " + sum );
    }
    System.out.println( "sum   = " + sum );
    return sum;
  }
}
