<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="recursos/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="recursos/bootstrap/css/bootstrap-theme.css">
	
<title> Administrador</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<form action="altaProducto" method="post">
		Precio:
		<input type="number" name="precio" class="form-control">
		Nombre:
		<input type="text" name="nombre" class="form-control">
		Material:
		<input type="text" name="matrial" class="form-control">
		Categoria:
		<select class="form-control">
			<option value="Cocina">
				Cocina
			</option>
			<option value="Dormitorio">
				Dormitorio
			</option>
			<option value="Baño">
				Baño
			</option>
			<option value="Exterior">
				Exterior
			</option>
		</select>	
		<input type="submit" class="btn btn-primaryS">
	</form>

</body>
</html>