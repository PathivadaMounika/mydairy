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
    <div class="bodypart">
      <div class="bodypart1">
         <img src="<c:url value="/images/dairy.jpg"/>" width="300">
      </div>
      
      <div class="bodypart2">
        <h1>LOGIN HERE</h1><br/><br/><br/>
        <form action="authenticate" method="POST">
          <label>Username <input type="text" name="username" class="formcontrol"></label><br/><br/>
          <label>Password <input type="password" name="password" class="formcontrol"></label><br/><br/><br/>
          <button type="submit">LOGIN</button>
        </form><br/><br/>
        New User? <a href="./register">Register</a> Here
      </div>
    
    </div>
</body>
</html>