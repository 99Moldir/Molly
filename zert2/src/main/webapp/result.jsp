<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Вывод данных:<br/>
Фамилия:${param.fname} <br/>
Имя:${param.lname} <br/>
GPI:${param.gpi}<br/>
<jsp:useBean id = "st" class = "pr.Prim">
<jsp:setProperty property ="fname" name="st" value = "${param.fname}"/>
<jsp:setProperty property ="gpi" name="st" value = "${param.gpi}"/>
Ваша фамилия: <jsp:getProperty name = "st" property = "fname" />
GPI:<jsp:getProperty name = "st" property = "gpi" />
</jsp:useBean> 
${st.print(3.2)}<br/>
</body>
</html>