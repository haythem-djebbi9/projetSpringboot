<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer une Marque</title>
</head>
<body>
<form action="saveMarque" method="post">
<pre>
nom : <input type="text" name="nomMarque">
chiffre d affaire : <input type="text" name="prixMarque">
date creation : <input type="date" name="date">
<input type="submit" value="ajouter">

</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeMarque">Liste Marque</a>
</body>
</html>