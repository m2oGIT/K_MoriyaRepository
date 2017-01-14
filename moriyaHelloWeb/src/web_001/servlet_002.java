
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
 * ���͕�����̔����\�������iweb_001 ��Q�D�̉𓚁j
 * </p>
 * <p>
 * �u���E�U������͒l��1���A�����l�̐g����ǂݍ��݁A�W���̏d��\�����܂��B
 * </p>
 *
 * @author moriya<br>
 *         �X�V����<br>
 *         2017/01/14:eis �X�J�F�V�K�쐬<br/>
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
    // �l�i�[�p
    String[] str_param = param_001.split( ",",0 );
    // ���͒l�P�̓��͌������J��Ԃ���������
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
