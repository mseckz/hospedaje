<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<head>
<sj:head  />
</head>

<h1>Reserva de Cuarto(s)</h1>

<s:form theme="bootstrap" action="registrarReservaPOST">
	<div class="form-group col-md-6">
		<s:hidden name="reserva.tipo_hab" value="%{reserva.tipo_hab}" />
		<sj:datepicker parentTheme="bootstrap"
							key="Fecha de llegada" name="reserva.fecha_llegada"
							cssClass="form-control" showOn="focus" inputAppendIcon="calendar"
							displayFormat="dd/mm/yy" minDate="0" />
	</div>
	<div class="form-group col-md-6">
	
		<sj:datepicker parentTheme="bootstrap"
							key="Fecha de salida" name="reserva.fecha_salida"
							cssClass="form-control" showOn="focus" inputAppendIcon="calendar"
							displayFormat="dd/mm/yy" minDate="0" />
	</div>
	
	<div class="form-group col-md-12">
		<s:select label="Cuartos" list="#{'1':'1','2':'2','3':'3','4':'4'}" name="reserva.cuartos" cssClass="form-control" />
	</div>
	<%-- <s:textfield key="# de personas" name="reserva.fecha_salida"  /> --%>
	
	<div class="form-group col-md-6">
		<s:textfield key="Nombres" name="reserva.nombres" cssClass="form-control" />
	</div>
	<div class="form-group col-md-6">
		<s:textfield key="Apellidos" name="reserva.apellidos" cssClass="form-control" />
	</div>
	
	<div class="form-group col-md-6">
		<s:textfield key="Correo" name="reserva.correo" cssClass="form-control" />
	</div>
	<div class="form-group col-md-6">
		<s:textfield key="Telefono" name="reserva.telefono" cssClass="form-control" />
	</div>
	<div class="form-group col-md-6">
		<s:submit value="Registrar" cssClass="btn btn-primary" />
	</div>
</s:form>