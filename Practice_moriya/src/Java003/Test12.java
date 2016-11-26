/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java003;

import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test12 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args
   */
  public static void main( String[] args ) {
Date wkDate = new Date();
SimpleFormatter sfm01 = SimpleFormatter( "yyyy/MM/dd HH:mm:ss" );
System.out.println( "実行日時は" + stm01(wkDate) + "です。" );
}
