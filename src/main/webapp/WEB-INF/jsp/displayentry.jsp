<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyDairy App Homepage</title>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>

 <div class="header">
   <div class="first">
      <img src="<c:url value="/images/dairy.jpg"/>" width="60" height="60">
   </div>

   <div class="second"> MyDairy App</div>
   
  
 </div>
 <br>
 <br>
 <hr/>
  <a href="./signout" style="color:red;float:right">Signout</a>
    <div class="bodypart">
      <div class="bodypart1">
         <img src="<c:url value="/images/dairy.jpg"/>" width="300">
      </div>
      
      <div class="bodypart2">
        <h1>VIEW ENTRY</h1><br/><br/><br/>
        <table>
          <tr><td>Date:</td><td>${entry.entrydate}</td></tr>
          <tr><td>Description:</td><td>${entry.description}</td></tr>
        </table>
       <br/><br/><br/>
       <a href="./userhome"> <button type="button">BACK TO HOME</button></a>
      </div>
    
    </div>
</body>
</html>