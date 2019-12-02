<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>

<title>Product Entry</title>

</head>

<body>



	<form:form id="form" modelAttribute="mvo1"
		action="confirmation" method="post">   
		<table align="center">
			<tr>
				<td><form:label path="name"> Name : </form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="description">Description: </form:label></td>
				<td><form:input path="description" name="description" id="description" /></td>
			</tr>
			<tr>

				<td><form:label path="comment">Comment:</form:label></td>

				<td><form:input path="comment" name="comment"
						id="comment" /></td>

			</tr>

			<tr>

				<td></td>

				<td align="left"><form:button id="save" name="save">Save</form:button>

				</td>

			</tr>

			<tr></tr>

		</table>

	</form:form>



</body>

</html>