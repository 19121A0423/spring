<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
	<body>
		<h1>Hotel-Room Booking</h1>
			<form:form method="POST" action="thankyou" modelAttribute="roombooking"  enctype="multipart/form-data">
				<table>
					<tr>
						<td><label>Name</label></td>
						<td><form:input type="text" path="name" />
						<form:errors path="name" /></td>
					</tr>
					<tr>
						<th><label>NoOfPersons</label></th>
						<th><form:input type="text" path="noOfPersons" /></th>
					</tr>
					<tr>
						<th colspan=2><input type="submit" value="book" /></th>
					</tr>
				</table>
			</form:form>
	</body>
</html>