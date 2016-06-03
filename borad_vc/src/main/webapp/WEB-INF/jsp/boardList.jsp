<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<h2>게시판 목록</h2>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="8%"/>
        <col width="15%"/>
        <col width="*"/>
        <col width="10%"/>
        <col width="15%"/>
        <col width="12%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">No</th>
            <th scope="col">Category</th>
            <th scope="col">제목</th>
            <th scope="col">버전</th>
            <th scope="col">등록일</th>
            <th scope="col">등록자</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>1</td>
                        <td>${row.CATECODE}</td>
                        <td>${row.TITLE}</td>
                        <td>${row.VERSION}</td>
                        <td>${row.MEMBERNO}</td>
                        <td>${row.UPDATEDATE}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
         
    </tbody>
</table>
</body>
</html>