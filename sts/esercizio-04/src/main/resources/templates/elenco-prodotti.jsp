<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Catalogo</title>
</head>
<body>
	<h1>Elenco prodotti</h1>
    
    <ul>
    <c:forEach var="prod" items="${elencoProdotti}">
        <li>${prod.descrizione}</li>
    </c:forEach>
    </ul>
</body>
</html>