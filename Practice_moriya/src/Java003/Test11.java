/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test11 {
  public static void main( String[] args ) {
    BigDecimal sumBD = new BigDecimal( "0" );
    for ( int i = 1; i <= 10; i++ ) {
      sumBD = sumBD.add( new BigDecimal( "0.1" ) );
      System.out.println( "i = " + i + " / " + "sumBD = " + sumBD );
    }
    sumBD = sumBD.multiply( new BigDecimal( "10" ) );
    System.out.println( "sumBD = " + sumBD );
  }
}
