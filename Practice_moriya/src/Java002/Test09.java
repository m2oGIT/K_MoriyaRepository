/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {
  public static void main( String[] args ) {
    int sum = 0;
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println( "�����F" + args[0] );
    Integer numInt = new Integer( args[0] );
    for ( int i = 1; i <= numInt; i++ ) {
      sum += i;
      System.out.println( "i = " + i + " / " + "sum = " + sum );
    }
    System.out.println( "sum = " + sum );
  }
}
