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
