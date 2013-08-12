<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  <s:actionerror />
  <br />
  
    please login in the Website:<br><br><br>
   <s:form method="POST" action="doLogin">
	<s:textfield name="user.userName" label="UserName" />
	<s:password name="user.userPWD" label="PassWord" />
	<s:submit value="Login " align="center" />
</s:form></body>
</html>
