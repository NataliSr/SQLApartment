<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/AddApartmentServlet" method="POST">
    District: <input type="text" name="district"><br>
    Address: <input type="text" name="address"><br>
    Area: <input type="text" name="area"><br>
    Number Of Rooms: <input type="text" name="numberOfRooms"><br>
    Price: <input type="text" name="price"><br>
    <input type="submit" value="Add Apartment"> </input>
</form>
<a href="ShowAllApartments">Show all apartments</a><br><br>

<form action="/FindbyPriceServlet" method="POST">
    With: <input type="text" name="with"><br>
    to: <input type="text" name="to"><br>
    <input type="submit" value="Show Apartment by price"> </input>
</form>

<form action="/DelApartmentServlet" method="POST">
    Id: <input type="text" name="id"><br>

    <input type="submit" value="Delete Apartment"> </input>
</form>

</body>
</html>