<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>My JSP 'MyBooks.jsp' starting page</title>
    
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
    This is my BookList: <br>
    <div>
    <table>
    <thead>
    <tr>
    	<th>书名</th>
    	<th>作者</th>
    	<th>分类</th>
    	<th>积分</th>
    	<th>出版社</th>
    	<th>路径</th>
    	<th>备注</th>
    	</tr>
    </thead>
<tbody>
    
    <s:iterator value="books" status="status">
   		 <tr>
   		 	<td><s:property value="%{BookName}" /> </td>
   		 	<td><s:property value="%{Author}" /> </td>
   		 	<td><s:property value="%{Category}" /> </td>
   		 	<td><s:property value="%{CreditValue}" /> </td>
   		 	<td><s:property value="%{Publisher}" /> </td>
   		 	<td><s:property value="%{Path}" /> </td>
   		 	<td><s:property value="%{Comments}" /><s:url id="deleteBook" action="bookDelete">
   		 		<s:param name="book.BookId" value="%{BookId}"></s:param>
   		 	</s:url> 
   		 	<s:a href="%{deleteBook}"><s:text name="删除"></s:text></s:a>
   		 	</td>
	 </tr>	
    </s:iterator>
      
    </tbody>
    </table>
    </div>
  </body>
</html>
