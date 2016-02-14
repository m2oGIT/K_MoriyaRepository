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
public class Test08 {
  public static void main( String[] args ){
    // TODO 自動生成されたメソッド・スタブ
    int sum = 0;
    for ( int i = 1; i <= 100; i++ ) {
      if ( i % 2 != 0)
      sum += i;
      System.out.println( "i = " + i + " / " + "sum = " + sum );
    }
    System.out.println( "sum = " + sum );
  }

}
