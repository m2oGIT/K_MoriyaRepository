
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
 * ���͕�����̔����\�������iweb_001 ��R�D�̉𓚁j
 * </p>
 * <p>
 * �u���E�U������͒l���R���A�l�����Z���s���܂��B
 * </p>
 *
 * @author moriya<br>
 *         �X�V����<br>
 *         2017/01/14:eis �X�J�F�V�K�쐬<br/>
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
    // �l�i�[�p
    double db_param_L = Integer.parseInt( param_001 );
    double db_param_R = Integer.parseInt( param_003 );
    double db_param_KEKKA = 0;
    //�l�����Z
    switch (param_002){
      case "+":
    }
  }

//  private int parseInt( String string ) {
//    // TODO �����������ꂽ���\�b�h�E�X�^�u
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
