<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>My JSP 'AddBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
	<s:form action="addBookInfo" method="post" tooltipConfig="%{'jsTooltipEnabled':'true'}" >
		<div>
			<h1>添加书本信息</h1> <br />		
		</div>
		<s:textfield name="bookinfo.Author" key="bookinfo.Author" tooltip="Enter your name" required="true" />
		<s:textfield name="bookinfo.BookName" key="bookinfo.BookName" tooltip="Enter your name" required="true" />
		<s:textfield name="bookinfo.Publisher" key="bookinfo.Publisher" tooltip="Enter your password" required="true" />
		<s:textfield name="bookinfo.Category" key="bookinfo.Category" tooltip="Repeat your password" required="true" />
		<s:textfield name="bookinfo.Path" key="bookinfo.Path" tooltip="bookpath" />
		<s:textfield name="bookinfo.Comments" key="bookinfo.Comments" />
		
		<s:submit />
		<s:reset />
	</s:form>
</center>
  </body>
</html>
