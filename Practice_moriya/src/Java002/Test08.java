/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test08 {
  public static void main( String[] args ){
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    int sum = 0;
    for ( int i = 1; i <= 100; i++ ) {
      if ( i % 2 != 0)
      sum += i;
      System.out.println( "i = " + i + " / " + "sum = " + sum );
    }
    System.out.println( "sum = " + sum );
  }

}