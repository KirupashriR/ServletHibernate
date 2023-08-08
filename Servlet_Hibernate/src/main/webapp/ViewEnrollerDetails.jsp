<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.digti.hibernate.servlet.bean.AadharDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    session = request.getSession();
    AadharDetails data = (AadharDetails) session.getAttribute("curUser");
    %>
    <h1>Your Details:</h1>
    <p>Aadhar Number:<%=data.getId()%></p><br>
    <p>Your Name: <%=data.getName()%></p><br>
    <p>EMail:<%=data.getEmail()%></p><br>
    <p>Phone Number:<%=data.getPhno()%></p><br>
    <p>Address Line:<%=data.getAddress()%></p><br>
    <p>City:<%=data.getCity()%></p><br>
    <p>State:<%=data.getState()%></p><br>
    <p> PinCode:<%=data.getPincode()%></p><br>
    <a href="index.html">Click here to redirect</a>
</body>
</html>