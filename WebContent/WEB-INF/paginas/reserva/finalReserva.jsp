<%@taglib prefix="s" uri="/struts-tags" %>

<h2>Reserva realizada con exito</h2>

<h4>Datos del cliente</h4>
<dl class="dl-horizontal">
	<dt>Nombres</dt>
	<dd><s:property value="%{ultimaReserva.nombres}"/></dd>
	<dt>Apellidos</dt>
	<dd><s:property value="%{ultimaReserva.apellidos}"/></dd>
	<dt>Correo</dt>
	<dd><s:property value="%{ultimaReserva.correo}"/></dd>
	<dt>Telefono</dt>
	<dd><s:property value="%{ultimaReserva.telefono}"/></dd>
</dl>

<hr>
<h4>Datos de reserva</h4>
<dl class="dl-horizontal">
	<dt>Tipo de habitacion</dt>
	<dd><s:property value="%{tipo.desc_hab}"/></dd>
	<dt>Cuartos</dt>
	<dd><s:property value="%{ultimaReserva.cuartos}"/></dd>
	<dt>Personas</dt>
	<dd><s:property value="%{ultimaReserva.personas}"/></dd>
	<dt>Fecha de Llegada</dt>
	<dd><s:property value="%{ultimaReserva.fecha_llegada}"/></dd>
	<dt>Fecha de Salida</dt>
	<dd><s:property value="%{ultimaReserva.fecha_salida}"/></dd>
	<dt>Monto Total</dt>
	<dd><s:property value="%{ultimaReserva.monto}"/></dd>
</dl>

<a class="btn btn-primary" href="<s:url action="listarHabitaciones" namespace="/reserva" />">Regresar</a>