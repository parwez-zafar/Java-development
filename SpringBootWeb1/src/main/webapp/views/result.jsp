<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2> Result is :   <%= session.getAttribute("result") %>  </h2>

         <h2> Result is :  ${result}  </h2>

         <h2> Welcome To Parwez</h2>
         <p> ${alien1}</p>

         <p> Welcome to the ${course} world </p>



    </body>
</html>
