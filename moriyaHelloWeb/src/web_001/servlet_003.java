
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
 * 入力文字列の反復表示処理（web_001 問３．の解答）
 * </p>
 * <p>
 * ブラウザから入力値を３つ取り、四則演算を行います。
 * </p>
 *
 * @author moriya<br>
 *         更新履歴<br>
 *         2017/01/14:eis 森谷：新規作成<br/>
 */
@WebServlet("/web_001/servlet_003")
public class servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public servlet_003() {
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
    String param_003 = request.getParameter( "param_003" );
    // 値格納用
    double db_param_L = Integer.parseInt( param_001 );
    double db_param_R = Integer.parseInt( param_003 );
    double db_param_KEKKA = 0;
    //四則演算
    switch (param_002){
      case "+":
    }
  }

//  private int parseInt( String string ) {
//    // TODO 自動生成されたメソッド・スタブ
//    return 0;
//  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub
  }

}
