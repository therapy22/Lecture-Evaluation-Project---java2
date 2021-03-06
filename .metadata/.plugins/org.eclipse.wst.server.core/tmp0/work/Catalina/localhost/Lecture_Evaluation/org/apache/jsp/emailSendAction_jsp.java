/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-08-30 02:30:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.Authenticator;
import java.util.Properties;
import user.UserDAO;
import util.SHA256;
import util.Gmail;
import java.io.PrintWriter;

public final class emailSendAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.mail.Message");
    _jspx_imports_classes.add("javax.mail.Address");
    _jspx_imports_classes.add("javax.mail.internet.InternetAddress");
    _jspx_imports_classes.add("util.SHA256");
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.util.Properties");
    _jspx_imports_classes.add("javax.mail.Transport");
    _jspx_imports_classes.add("javax.mail.Session");
    _jspx_imports_classes.add("javax.mail.internet.MimeMessage");
    _jspx_imports_classes.add("util.Gmail");
    _jspx_imports_classes.add("user.UserDAO");
    _jspx_imports_classes.add("javax.mail.Authenticator");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	UserDAO userDAO = new UserDAO();
	String userID = null;
	if(session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	if(userID == null || userID.equals("")) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인을 해주세요.');");
		script.println("location.href = 'userLogin.jsp';");
		script.println("</script>");
		script.close();
		return;
	}
	boolean emailChecked = userDAO.getUserEmailChecked(userID);
	if(emailChecked == true) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 인증 된 회원입니다.');");
		script.println("location.href = 'index.jsp'");
		script.println("</script>");
		script.close();
		return;
	}
	
	
	//Should check this line later
	String host = "http://localhost:8080/Lecture_Evaluation/";
	String from = "suminjung09@gmail.com";
	String to = userDAO.getUserEmail(userID);
	String subject = "강의 평가를 위한 이메일 인증 메일입니다.";
	String content = "다음 링크에 접속하여 이메일 인증을 진행하세요." +
		"<a href='" + host + "emailCheckAction.jsp?code=" + new SHA256().getSHA256(to) + "'>이메일 인증하기</a>";
	
	Properties p = new Properties();
	p.put("mail.smtp.user", from);
	p.put("mail.smtp.host", "smtp.googlemail.com");
	p.put("mail.smtp.port", "465");
	p.put("mail.smtp.starttls.enable", "true");
	p.put("mail.smtp.auth", "true");
	p.put("mail.smtp.debug", "true");
	p.put("mail.smtp.socketFactory.port", "465");
	p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	p.put("mail.smtp.socketFactory.fallback", "false");
	
	try {
		Authenticator auth = new Gmail();
		Session ses = Session.getInstance(p, auth);
		ses.setDebug(true);
		MimeMessage msg = new MimeMessage(ses);
		msg.setSubject(subject);
		Address fromAddr = new InternetAddress(from);
		msg.setFrom(fromAddr);
		Address toAddr = new InternetAddress(to);
		msg.addRecipient(Message.RecipientType.TO, toAddr);
		msg.setContent(content, "text/html;charset=UTF8");
		Transport.send(msg);
				
	} catch (Exception e) {
		e.printStackTrace();
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('오류가 발생했습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html\" charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content= \"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t<title>강의평가 웹 사이트</title>\r\n");
      out.write("\t<!--부트스트랩 CSS 추가하기-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("\t<!--custom CSS 추가하기-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/custom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"height: 100%;\">\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\">강의평가 웹 사이트</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"index.jsp\">메인</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"dropdown\" data-toggle=\"dropdown\">회원 관리</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown\">\r\n");

	if(userID == null) {	

      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userLogin.jsp\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userJoin.jsp\">회원가입</a>\r\n");

	} else {

      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userLogout.jsp\">로그아웃</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t</li>\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("\t\t\t<input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"내용을 입력하세요.\" aria-label=\"search\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">검색</button>\t\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<section class=\"container mt-3\" style=\"max-width: 560px;\">\r\n");
      out.write("\t \t<div class=\"alert alert-success mt-4\" role=\"alert\">\r\n");
      out.write("\t \t\t이메일 주소 인증 메일이 전송되었습니다. 회원가입시 입력했던 이메일에 들어가셔서 인증해주세요.\r\n");
      out.write("\t \t</div>\r\n");
      out.write("\t</section>\t\t\t\r\n");
      out.write("\t<footer class=\"bg-dark mt-4 p-5 text-center fixed-bottom\" style=\"color: #FFFFFF;\">\r\n");
      out.write("\t\tCopyright &copy; 2018 정수민 ALL Rights Reserved.\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- 제이쿼리 자바스크립트 추가하기 -->\r\n");
      out.write("\t<script src=\"./js/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jqeury 자바스크립트 추가하기 -->\r\n");
      out.write("\t<script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- popper 자바스크립트 추가하기 -->\r\n");
      out.write("\t<script src=\"./js/popper.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
