<%@ page contentType="text/html; charset=gb2312" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-html" prefix="html" %>
<html>
<head>
<title></title>
<link href="../CSS/stylesheet.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="FFFFFF"><br><br><br>

<html:form action="/Admin/login.do?method=login"><!-- background="../images/login_back.jpg -->

	<table width="512" height="324" border="0" align="center" cellpadding="0" cellspacing="0" background="../images/login_back1.JPG">
	
	  <tr>
		<td height="50"><h2 align="left"><b>����Ա��¼</b></h2></td>
	  </tr>
	  <tr>
		<td><table width="60%" height="90%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr height="20">
			<td width="70" class="blackTitle">
				<bean:message key="admin.loginName" />��
			</td>
			<td>
				<html:text property="loginName" size="20" styleClass="textBox"/>
			</td>
			</tr><br/>
			<tr height="20">
			<td width="70" class="blackTitle">
				<bean:message key="admin.loginPwd"/>��
			</td>
			<td>
				<html:password property="loginPwd" size="20" styleClass="textBox"/>
			</td>
			</tr>
			<tr height="20">
			<td width="70">&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td width="70">
				<div align="left">				
					<input type="image" src="../images/login_button.jpg" border="0">
					<!--input type="button" name="" id="" value="��¼"/-->
					<!--   herf="http://localhost:8067/wgsc/mer.do?method=browseIndexMer" target="_blank">����</a>-->
				</div>
			</td>
		  </tr>
		  <tr height="20">
		  <td></td>
		  <td height="20" colspan="5" class="redText">
			<html:errors/>
		  </td>
		</tr>
		
		</table></td>
	  </tr>
	</table>
	
</html:form>

</body>
</html>
