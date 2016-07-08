<%@taglib prefix="s" uri="/struts-tags" %>


<div class="row">
<s:iterator value="tipos">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
    	<s:url action="registrarReserva" id='formreserva' namespace='citas'  >
			<s:param name='idTipo'>
				<s:property value='tipo_hab'/>
			</s:param>
		</s:url>
        <s:a href="%{formreserva}"><img src="${pageContext.request.contextPath}/<s:property value="image_tipo" />" alt="..."></s:a>
      
      <div class="caption">
        <h3><s:property value="desc_hab"/></h3>
        <p>Precio: $ <s:property value="precio"/></p>
      </div>
    </div>
  </div>
</s:iterator>
</div>
