<%@ page contentType="text/html; charset=gb2312" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-html" prefix="html" %>
<jsp:useBean id="JSONRPCBridge" scope="session" class="com.metaparadigm.jsonrpc.JSONRPCBridge"/>
<jsp:useBean id="ajax" class="com.itbaizhan.base.AjaxBean"></jsp:useBean>
<%
	JSONRPCBridge.registerObject("ajax",ajax);
%>
<html>
<head>
<title><bean:message key="website.title"/></title>
<link href="CSS/stylesheet.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="JS/jsonrpc.js"></script>
</head>
<body class="body">
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
	<td height="270" background="images/fg_top2.jpg"></td>
  </tr>
</table>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" style="border:1px; border-style:solid; border-color:#888888">
  <tr>
    <td width="20">&nbsp;</td>
    <TD height="50" align="right" valign="bottom">
		<IMG src="images/icon_login.gif" align=absMiddle> 
		<INPUT id="qKey" name="qKey" value="ũ��Ʒ�ؼ���" onClick="this.value=''"> 
		<SELECT id="category" name="category">
			<option value="0">����ũ��Ʒ</option>
		</SELECT>
		<A href="javascript:QuickSearch()"><IMG src="images/icon_search.gif" align="absMiddle" border="0"></A>
    </TD>
    <td width="20">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>
	<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TR align="center">
          <TD valign="top" width="9"><IMG src="images/icon02.gif"></TD>
          <TD class="header_menu" align="middle">
		  	<A href="mer.do?method=browseIndexMer"><span class="whiteTitle"><bean:message key="menu.item1"/></span></A>
		  </TD>
          <TD background="images/Bule_06.gif" width="2"></TD>
          <TD class="header_menu" align="middle">
		  	<A href="cart.do?method=browseCart"><span class="whiteTitle"><bean:message key="menu.item2"/></span></A>
		  </TD>
          <TD background="images/Bule_06.gif" width="2"></TD>
          <TD class="header_menu" align="middle">
		  	<A href="order.do?method=browseOrder"><span class="whiteTitle"><bean:message key="menu.item3"/></span></A>
		  </TD>
          <TD background="images/Bule_06.gif" width="2"></TD>
          <TD class="header_menu" align="middle">
		  	<A href="mem.do?method=browseWord"><span class="whiteTitle"><bean:message key="menu.item4"/></span></A>
		  </TD>
          <TD background="images/Bule_06.gif" width="2"></TD>
          <TD class="header_menu" align="middle">
		  	<A href="mem.do?method=loadMember"><span class="whiteTitle"><bean:message key="menu.item5"/></span></A>
		  </TD>
          <TD vAlign=top width=7><IMG src="images/icon07.gif"></TD>
        </TR>
    </TABLE></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
			<!-- ��¼���� -->			
            <td align="center">  	
              	<logic:notPresent name="member">
	                <html:javascript formName="memLoginForm"/>
					<html:form action="/login.do?method=login" style="margin:0px;" onsubmit="return validateMemLoginForm(this);">
					  <TABLE cellSpacing=20 cellPadding=5 width="100%" border=0>
					  
	                    <td cellSpacing=1 align="center">
						      <img src="images/logintitle1.gif" ></img>
						</td>
	                    <TR>
	                      <TD>
							  <TABLE cellSpacing=0 cellPadding=0 width="90%" align=center border=0>
		                           <TR height="30">
		                             <TD align="center"><bean:message key="member.login.name"/>��
								 	<html:text property="loginName" size="10" styleClass="textBox"/>
								  </TD>
		                           </TR>
		                           <TR height="30">
		                             <TD align="center"><bean:message key="member.login.pwd"/>��
									  <html:password property="loginPwd" size="10" styleClass="textBox"/>
								  </TD>
		                           </TR>
		                           <TR height="30">
		                             <TD align="center">
		                             	<html:submit style="color:#333;background-color:#fff;"><bean:message key="member.login.text"/></html:submit>
		                             	<input type="button" value="ȡ��" onclick="cancel()" style="color:#333;background-color:#fff;">
		                               
								  </TD>
		                         </TR>
	                      </TABLE> 
						</TR>
					  </TABLE>
					</html:form>              	
              	</logic:notPresent>
			  </td>
            
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td height="30">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
	<td height="30" style="background-image:url(images/header_menu_012.gif);" align="center" class="blackText"><bean:message key="website.foot"/></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td height="20">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<script language="javascript">

	//ȡ����¼��������ҳ��
	function cancel(){
		window.location = "default.jsp";
	}
	
	//����ũ��Ʒ���������б�
	jsonrpc = new JSONRpcClient("JSON-RPC");
	var result = jsonrpc.ajax.getCategory();
	for (var i=0;i<result.length;i++){
		option =document.createElement("OPTION");
		option.value = result[i][0];
		option.text = result[i][1];
		document.all.category.options.add(option);
	}
	
	//����ũ��Ʒ
	function QuickSearch(){
		var url = "mer.do?method=searchMer&cateid="+document.all.category.value;
		var key = document.all.qKey.value;
		if (key !=null && key!="ũ��Ʒ�ؼ���" && key.length>0)url = url+"&key="+key;
		window.location = url;
	}
</script>	
</body>
</html>