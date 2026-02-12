<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        <h1>UPDATE ENTRY</h1><br/><br/><br/>
        <form action="./processentryupdate" method="POST">
          <label>Date </label>
          <input type="date" name="entrydate" class="formcontrol" value="<fmt:formatDate value="${entry.entrydate}" pattern='yyyy-MM-dd'/>" ><br/><br/>
          <label>Description </label>
             <textarea rows="10" cols="30" name="description">${entry.description}</textarea>

              <input type="hidden" name="userid" value="${user.id}"> 
             <input type="hidden" name="id" value="${entry.id}">
          <br/><br/><br/>
          <button type="submit">UPDATE ENTRY</button>
        </form><br/><br/>
        
      </div>
    
    </div>
</body>
</html>