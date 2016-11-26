
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
 * 入力文字列の反復表示処理（web_001 問１．の解答）
 * </p>
 * <p>
 * フォームに入力された文字列を反復表示します。
 * </p>
 *
 * @author moriya<br>
 *         更新履歴<br>
 *         2016/11/26:eis 森谷：新規作成<br/>
 */
@WebServlet("/web_001/servlet_001")
public class servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public servlet_001() {
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
    String param_002 = request.getParameter( "param_002" );
    // 値格納用
    int i_param = Integer.parseInt( param_002 );
    // 入力値２の回数分を繰り返し表示する
    for ( int i = 1; i <= i_param; i++ ) {
      pw.println( param_001 );
      // pw.println(param_001);
      // pw.println(param_002);
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
