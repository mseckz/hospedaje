<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tiles"  uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<title>Hotel Los Delfines</title>
	
	
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="cabecera"/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<tiles:insertAttribute name="menu"/>
			</div>
			<div class="col-md-9">
				<tiles:insertAttribute name="contenido"/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				 <tiles:insertAttribute name="pie"/>	
			</div>
		</div>
	</div>
</body>
</html>