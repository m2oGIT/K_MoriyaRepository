/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java003;

import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test12 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args
   */
  public static void main( String[] args ) {
Date wkDate = new Date();
SimpleFormatter sfm01 = SimpleFormatter( "yyyy/MM/dd HH:mm:ss" );
System.out.println( "���s������" + stm01(wkDate) + "�ł��B" );
}
