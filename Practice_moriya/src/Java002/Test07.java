/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test07 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
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
