/*
 * JSP generated by Resin-3.1.9 (built Mon, 13 Apr 2009 11:09:12 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class _wrong__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    java.lang.Throwable exception = ((com.caucho.jsp.PageContextImpl) pageContext).getThrowable();
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      
    		Logger log = LoggerFactory.getLogger(getClass());
	    	if(exception != null) {
	            log.error("page error", exception);
	        }
    	
      out.write(_jsp_string1, 0, _jsp_string1.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 5783496155892875126L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("wrong.jsp"), -3798105477883506937L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\r\n    </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n</div>\r\n\r\n<!-- \u5e95\u90e8 -->\r\n<!-- /\u5e95\u90e8 -->\r\n</body>\r\n</html>".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>\u51fa\u9519\u4e86</title>\r\n</head>\r\n<body>\r\n<!-- \u9876\u90e8 -->\r\n<!-- /\u9876\u90e8 -->\r\n<!-- \u5934\u90e8 -->\r\n<!-- /\u5934\u90e8 -->\r\n<div class=\"spg_bg\">\r\n<div class=\"pport_main\">\r\n	<div class=\"pport_main_hd\">\r\n  	<b>\u8bbf\u95ee\u9519\u8bef</b> \r\n  </div>\r\n  <div class=\"pport_main_bd\">\r\n  	<div class=\"pb_error_tip clearfix\">\r\n    	<span class=\"icon\"></span>\r\n    	<div class=\"txt\">\r\n      <p class=\"fsb fw\">\u5f88\u62b1\u6b49\uff0c\u60a8\u8bbf\u95ee\u7684\u9875\u9762\u4e0d\u5b58\u5728</p>\r\n      <p>\u8fd9\u53ef\u80fd\u662f\u7531\u4ee5\u4e0b\u539f\u56e0\u9020\u6210</p>\r\n      <p>\u00b7 \u5730\u5740\u8f93\u5165\u5b58\u5728\u9519\u8bef\uff0c\u8bf7\u6838\u5bf9\u540e\u518d\u6b21\u5c1d\u8bd5</p>\r\n      <p>\u00b7 \u6240\u8bbf\u95ee\u7684\u9875\u9762\u5df2\u88ab\u8f6c\u79fb\uff0c\u5efa\u8bae\u8fd4\u56de<a href=\"http://user.laohu.com\" class=\"rs\">\u8001\u864e\u9996\u9875</a>\u91cd\u65b0\u67e5\u9605</p>\r\n      <p class=\"fsb fw btn\">\r\n      	<a href=\"http://user.laohu.com\" class=\"rs\">\u8fd4\u56de\u8001\u864e\u9996\u9875</a>\r\n        <a href=\"#\" onclick=\"history.go(-1);return false;\">\u8fd4\u56de\u4e0a\u4e00\u9875</a>\r\n      </p>\r\n    </div>\r\n    <div style=\"display:none\">\r\n    	".toCharArray();
  }
}
