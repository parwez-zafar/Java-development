<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2> Parwez Calculator</h2>
        <form action="add">
            <label form="num1"> Enter 1st Number: <label>
            <input type="text" id="num1" name="num1"> <br>

            <label form="num2"> Enter 12nd Number: <label>
            <input type="text" id="num2" name="num2"> <br>

            <input type="submit" value="Submit">


        </form>
        <br>
        <br>
        <br>
        <hr>


         <form action="addAlien">
            <label for="aid">Enter Id :</label>
            <input type="text" id="aid" name="aid"><br>
            <label for="aname">Enter Name :</label>
            <input type="text" id="aname" name="aname"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
