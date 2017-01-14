
package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 入力文字列の反復表示処理（web_001 問２．の解答）
 * </p>
 * <p>
 * ブラウザから入力値を1つ取り、複数人の身長を読み込み、標準体重を表示します。
 * </p>
 *
 * @author moriya<br>
 *         更新履歴<br>
 *         2017/01/14:eis 森谷：新規作成<br/>
 */
@WebServlet("/web_001/servlet_002")
public class servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public servlet_002() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    request.setCharacterEncoding( "UTF-8" );
    response.setContentType( "text/html;charset=UTF-8" );
    PrintWriter pw = response.getWriter();
    String param_001 = request.getParameter( "param_001" );
    // 値格納用
    String[] str_param = param_001.split( ",",0 );
    // 入力値１の入力個数分を繰り返し処理する
    for ( int i = 0; i < str_param.length; i++ ) {
      int in_height = Integer.parseInt(str_param[i]);
      double db_weight = ((in_height - 100) * 0.9);
//      db_weight = (db_weight * 0.9);
      pw.println( db_weight + "<br>");
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub
  }

}
