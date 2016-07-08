<%@ taglib prefix="s" uri="/struts-tags"%>

<style>
	.nav>li>a:focus, .nav>li>a:hover {
		color: black;
	}
	
	.nav>li>a {
		color:white;
	}
</style>

<ul class="nav nav-pills nav-stacked navbar-inverse">
	<li>
		<a href="<s:url action="inicio" />" class="active">
			Home
		</a>
	</li>
	<li>
		<a	href="<s:url action="listarHabitaciones" namespace="/reserva"/>">
			<s:text name="Realizar Reserva" />
		</a>
	</li>
	<li>
		<a	href="nosotros">
			<s:text name="Nosotros" />
		</a>
	</li>
	<li>
		<a	href="<s:url action="mostrarRegistroCliente" namespace="/reserva"/>">
			<s:text name="Registrese" />
		</a>	
	</li>
</ul>
