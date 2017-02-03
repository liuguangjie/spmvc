<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 17-2-2
  Time: 下午8:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>editStudent</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/api/saveAndUpdate.action" method="post">
        <input type="text" name="name" value="${requestScope.stu.name}"/><br/>
        <input type="text" name="age" value="${requestScope.stu.age}"/><br/>
        <input type="text" name="birthday" value="<fmt:formatDate value="${requestScope.stu.birthday}" pattern="yyyy-MM-dd"/>"/><br/>

        <input type="submit" value="submit"/>
    </form>
</body>
</html>
