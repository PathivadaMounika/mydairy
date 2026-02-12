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
        <h1>ADD ENTRY</h1><br/><br/><br/>
        <form action="./saveentry" method="POST">
          <label>Date <input type="date" name="entrydate" class="formcontrol"></label><br/><br/>
          <label>Description </label>
             <textarea rows="10" cols="30" name="description">
             </textarea>
             <input type="hidden" name="userid" value="${user.id}">
          <br/><br/><br/>
          <button type="submit">SAVE ENTRY</button>
        </form><br/><br/>
        
      </div>
    
    </div>
</body>
</html>