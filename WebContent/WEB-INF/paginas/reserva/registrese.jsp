<%@taglib prefix="s" uri="/struts-tags" %>

<h1>Registro de Cliente</h1>

<s:if test="hasActionMessages()">
	<div class="alert alert-success">
		<s:actionmessage/>
	</div>
</s:if>


<s:form theme="bootstrap" action="registrarCliente">

	<div class="form-group col-md-6">
		<s:textfield key="Nombres" name="cliente.nombres" cssClass="form-control" />
	</div>
	<div class="form-group col-md-6">
		<s:textfield key="Apellidos" name="cliente.apellidos" cssClass="form-control" />
	</div>
	
	<div class="form-group col-md-6">
		<s:textfield key="Correo" name="cliente.correo" cssClass="form-control" />
	</div>
	<div class="form-group col-md-6">
		<s:textfield key="Telefono" name="cliente.telefono" cssClass="form-control" />
	</div>
	
	<div class="form-group col-md-6">
		<s:submit value="Registrar" cssClass="btn btn-primary" />
	</div>
</s:form>