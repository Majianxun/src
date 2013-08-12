<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="register.welcome" /></title>
</head>
<body>
<center>
	<s:form action="regist" method="post" tooltipConfig="%{'jsTooltipEnabled':'true'}" >
		<div>
			<h1><s:text name="regist.welcome" /></h1> <br />
			<s:property value="exception.message" />		
		</div>
		<s:textfield name="user.userName" key="user.userName" tooltip="Enter your name" required="true" />
		<s:password name="user.userPWD" key="user.userPWD" tooltip="Enter your password" required="true" />
		<s:password name="repassword" key="repassword" tooltip="Repeat your password" required="true" />
		<s:submit />
		<s:reset />
	</s:form>
</center>
</body>
</html>